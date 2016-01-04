package com.mmpsoftware.x.sentinel.controller;

import com.mmpsoftware.x.sentinel.domain.Conversation;
import com.mmpsoftware.x.sentinel.repository.es.ConversationRepository;
import org.elasticsearch.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ffazil
 * @since 24/12/15
 */
//@RestController
public class ConversationController {

    /*@Autowired
    private ConversationRepository conversationRepository;

    @RequestMapping(value = "/conversations", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Conversation>> findAll(){

        List<Conversation> conversations = new ArrayList<>(0);
        conversationRepository.findAll().forEach(c -> {
            conversations.add(c);
        });

        return new ResponseEntity<List<Conversation>>(conversations, HttpStatus.OK);
    }*/
}
