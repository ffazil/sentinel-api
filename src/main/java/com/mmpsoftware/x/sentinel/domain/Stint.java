package com.mmpsoftware.x.sentinel.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

/**
 * @author ffazil
 * @since 05/12/15
 */
@Document(indexName = "stints")
public class Stint {

    @Id
    private String uid;

    protected String value;
    protected String sid;
    protected Date startTime;
    protected Date endTime;
    protected String description;
    protected String conversationPhaseType;

    private Stint(){

    }

    public String getUid() {
        return uid;
    }

    public String getValue() {
        return value;
    }

    public String getSid() {
        return sid;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public String getDescription() {
        return description;
    }

    public String getConversationPhaseType() {
        return conversationPhaseType;
    }
}
