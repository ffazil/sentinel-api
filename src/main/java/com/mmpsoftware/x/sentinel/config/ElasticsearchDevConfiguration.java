package com.mmpsoftware.x.sentinel.config;

import org.elasticsearch.client.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.elasticsearch.client.NodeClientFactoryBean;
import org.springframework.data.elasticsearch.client.TransportClientFactoryBean;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.util.StringUtils;

import static org.elasticsearch.node.NodeBuilder.nodeBuilder;

/**
 * @author ffazil
 * @since 08/12/15
 */
@Profile("dev")
@Configuration
@EnableElasticsearchRepositories(basePackages = {"com.mmpsoftware.x.sentinel.repository.es"})
public class ElasticsearchDevConfiguration implements DisposableBean{

    private static final Logger logger = LoggerFactory.getLogger(ElasticsearchDevConfiguration.class);

    @Autowired
    private ElasticsearchProperties properties;

    private Client client;

    @Bean
    public Client elasticsearchClient() {
        try {
            this.client = createClient();
            return this.client;
        }
        catch (Exception ex) {
            throw new IllegalStateException(ex);
        }
    }

    private Client createClient() throws Exception {
        if (StringUtils.hasLength(this.properties.getClusterNodes())) {
            return createTransportClient();
        }
        return createNodeClient();
    }

    private Client createNodeClient() throws Exception {
        NodeClientFactoryBean factory = new NodeClientFactoryBean(true);
        factory.setClusterName(this.properties.getClusterName());
        factory.afterPropertiesSet();
        return factory.getObject();
    }

    private Client createTransportClient() throws Exception {
        TransportClientFactoryBean factory = new TransportClientFactoryBean();
        factory.setClusterName(this.properties.getClusterName());
        factory.setClusterNodes(this.properties.getClusterNodes());
        factory.afterPropertiesSet();
        return factory.getObject();
    }

    @Override
    public void destroy() throws Exception {
        if (this.client != null) {
            try {
                if (logger.isInfoEnabled()) {
                    logger.info("Closing Elasticsearch client");
                }
                if (this.client != null) {
                    this.client.close();
                }
            }
            catch (final Exception ex) {
                if (logger.isErrorEnabled()) {
                    logger.error("Error closing Elasticsearch client: ", ex);
                }
            }
        }
    }

    //Create Elastic template from the list of available clients
    @Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchTemplate(elasticsearchClient());
    }
}
