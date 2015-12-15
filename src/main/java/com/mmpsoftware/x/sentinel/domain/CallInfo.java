package com.mmpsoftware.x.sentinel.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author ffazil
 * @since 05/12/15
 */
@Document(indexName = "callInfos")
public class CallInfo {

    @Id
    private String uid;

    protected String dtmfInput;
    protected Long callId;
    protected Long called;
    protected String cli;
    protected Long destination;
    protected Integer destinationRoute;
    protected Integer node;
    protected Integer port;
    protected Integer trunk;
    protected Integer timeslot;
    protected String type;


    private CallInfo(){

    }

    public String getUid() {
        return uid;
    }

    public String getDtmfInput() {
        return dtmfInput;
    }

    public Long getCallId() {
        return callId;
    }

    public Long getCalled() {
        return called;
    }

    public String getCli() {
        return cli;
    }

    public Long getDestination() {
        return destination;
    }

    public Integer getDestinationRoute() {
        return destinationRoute;
    }

    public Integer getNode() {
        return node;
    }

    public Integer getPort() {
        return port;
    }

    public Integer getTrunk() {
        return trunk;
    }

    public Integer getTimeslot() {
        return timeslot;
    }

    public String getType() {
        return type;
    }
}
