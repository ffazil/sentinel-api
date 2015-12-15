package com.mmpsoftware.x.sentinel.repository.es;

import com.mmpsoftware.x.sentinel.domain.Conversation;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author ffazil
 * @since 08/12/15
 */
@RepositoryRestResource
public interface ConversationRepository extends ElasticsearchRepository<Conversation, String>{
}
