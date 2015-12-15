package com.mmpsoftware.x.sentinel.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author ffazil
 * @since 05/12/15
 */
@Document(indexName = "speakers")
public class Speaker {

    @Id
    private String uid;

    protected String value;
    protected String acousticModel;
    protected String context;
    protected String description;
    protected String sid;
    protected String sex;
    protected String email;
    protected String name;
    protected String type;

    private Speaker(){

    }

    public String getUid() {
        return uid;
    }

    public String getValue() {
        return value;
    }

    public String getAcousticModel() {
        return acousticModel;
    }

    public String getContext() {
        return context;
    }

    public String getDescription() {
        return description;
    }

    public String getSid() {
        return sid;
    }

    public String getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
