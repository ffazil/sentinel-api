package com.mmpsoftware.x.sentinel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import static org.elasticsearch.node.NodeBuilder.nodeBuilder;

/**
 * @author ffazil
 * @since 08/12/15
 */
@Profile("dev")
@Configuration
@EnableElasticsearchRepositories(basePackages = {"com.mmpsoftware.x.sentinel.repository.es"})
public class ElasticsearchDevConfiguration {

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchTemplate(nodeBuilder().local(true).node().client());
    }
}
