package com.mmpsoftware.x.sentinel.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ffazil
 * @since 05/12/15
 */
@Document(indexName = "dialogues")
public class Dialogue {
    @Id
    private String uid;
    protected Set<Turn> turns = new HashSet<>(0);

    private Dialogue(){

    }

    public String getUid() {
        return uid;
    }

    public Set<Turn> getTurns() {
        return turns;
    }
}
