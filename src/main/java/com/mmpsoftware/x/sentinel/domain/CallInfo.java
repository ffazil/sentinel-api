package com.mmpsoftware.x.sentinel.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author ffazil
 * @since 05/12/15
 */
public class CallInfo {

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


    public CallInfo(String dtmfInput, Long callId, Long called, String cli, Long destination, Integer destinationRoute, Integer node, Integer port, Integer trunk, Integer timeslot, String type) {
        this.dtmfInput = dtmfInput;
        this.callId = callId;
        this.called = called;
        this.cli = cli;
        this.destination = destination;
        this.destinationRoute = destinationRoute;
        this.node = node;
        this.port = port;
        this.trunk = trunk;
        this.timeslot = timeslot;
        this.type = type;
    }

    public CallInfo() {

    }


    public void setDtmfInput(String dtmfInput) {
        this.dtmfInput = dtmfInput;
    }

    public void setCallId(Long callId) {
        this.callId = callId;
    }

    public void setCalled(Long called) {
        this.called = called;
    }

    public void setCli(String cli) {
        this.cli = cli;
    }

    public void setDestination(Long destination) {
        this.destination = destination;
    }

    public void setDestinationRoute(Integer destinationRoute) {
        this.destinationRoute = destinationRoute;
    }

    public void setNode(Integer node) {
        this.node = node;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public void setTrunk(Integer trunk) {
        this.trunk = trunk;
    }

    public void setTimeslot(Integer timeslot) {
        this.timeslot = timeslot;
    }

    public void setType(String type) {
        this.type = type;
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

    public static class CallInfoBuilder {
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

        private CallInfoBuilder() {
        }

        public static CallInfoBuilder aCallInfo() {
            return new CallInfoBuilder();
        }

        public CallInfoBuilder withDtmfInput(String dtmfInput) {
            this.dtmfInput = dtmfInput;
            return this;
        }

        public CallInfoBuilder withCallId(Long callId) {
            this.callId = callId;
            return this;
        }

        public CallInfoBuilder withCalled(Long called) {
            this.called = called;
            return this;
        }

        public CallInfoBuilder withCli(String cli) {
            this.cli = cli;
            return this;
        }

        public CallInfoBuilder withDestination(Long destination) {
            this.destination = destination;
            return this;
        }

        public CallInfoBuilder withDestinationRoute(Integer destinationRoute) {
            this.destinationRoute = destinationRoute;
            return this;
        }

        public CallInfoBuilder withNode(Integer node) {
            this.node = node;
            return this;
        }

        public CallInfoBuilder withPort(Integer port) {
            this.port = port;
            return this;
        }

        public CallInfoBuilder withTrunk(Integer trunk) {
            this.trunk = trunk;
            return this;
        }

        public CallInfoBuilder withTimeslot(Integer timeslot) {
            this.timeslot = timeslot;
            return this;
        }

        public CallInfoBuilder withType(String type) {
            this.type = type;
            return this;
        }

        public CallInfoBuilder but() {
            return aCallInfo().withDtmfInput(dtmfInput).withCallId(callId).withCalled(called).withCli(cli).withDestination(destination).withDestinationRoute(destinationRoute).withNode(node).withPort(port).withTrunk(trunk).withTimeslot(timeslot).withType(type);
        }

        public CallInfo build() {
            CallInfo callInfo = new CallInfo();
            callInfo.setDtmfInput(dtmfInput);
            callInfo.setCallId(callId);
            callInfo.setCalled(called);
            callInfo.setCli(cli);
            callInfo.setDestination(destination);
            callInfo.setDestinationRoute(destinationRoute);
            callInfo.setNode(node);
            callInfo.setPort(port);
            callInfo.setTrunk(trunk);
            callInfo.setTimeslot(timeslot);
            callInfo.setType(type);
            return callInfo;
        }
    }
}
