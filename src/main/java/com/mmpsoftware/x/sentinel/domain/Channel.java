package com.mmpsoftware.x.sentinel.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author ffazil
 * @since 05/12/15
 */
@Document(indexName = "channels")
public class Channel {

    @Id
    private String uid;

    protected String value;
    protected String sid;
    protected Integer sequenceNr;
    protected String name;
    protected String recorder;

    private Channel(){

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

    public Integer getSequenceNr() {
        return sequenceNr;
    }

    public String getName() {
        return name;
    }

    public String getRecorder() {
        return recorder;
    }
}
