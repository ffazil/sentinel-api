package com.mmpsoftware.x.sentinel.config;

/**
 * @author ffazil
 * @since 24/12/15
 */
@SuppressWarnings("rawtypes")
public class RestElasticsearchRepositoryFactoryBean extends org.springframework.data.elasticsearch.repository.support.ElasticsearchRepositoryFactoryBean {
    @SuppressWarnings("unchecked")
    @Override
    public void afterPropertiesSet() {
        setMappingContext(new org.springframework.data.elasticsearch.core.mapping.SimpleElasticsearchMappingContext());
        super.afterPropertiesSet();
    }
}
