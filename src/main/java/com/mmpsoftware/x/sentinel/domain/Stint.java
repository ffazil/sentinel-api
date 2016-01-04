package com.mmpsoftware.x.sentinel.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

/**
 * @author ffazil
 * @since 05/12/15
 */
public class Stint {

    protected String value;
    protected String sid;
    protected Date startTime;
    protected Date endTime;
    protected String description;
    protected String conversationPhaseType;

    public Stint(String value, String sid, Date startTime, Date endTime, String description, String conversationPhaseType) {
        this.value = value;
        this.sid = sid;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
        this.conversationPhaseType = conversationPhaseType;
    }

    public Stint() {
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

    public static class StintBuilder {
        protected String value;
        protected String sid;
        protected Date startTime;
        protected Date endTime;
        protected String description;
        protected String conversationPhaseType;

        private StintBuilder() {
        }

        public static StintBuilder aStint() {
            return new StintBuilder();
        }

        public StintBuilder withValue(String value) {
            this.value = value;
            return this;
        }

        public StintBuilder withSid(String sid) {
            this.sid = sid;
            return this;
        }

        public StintBuilder withStartTime(Date startTime) {
            this.startTime = startTime;
            return this;
        }

        public StintBuilder withEndTime(Date endTime) {
            this.endTime = endTime;
            return this;
        }

        public StintBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public StintBuilder withConversationPhaseType(String conversationPhaseType) {
            this.conversationPhaseType = conversationPhaseType;
            return this;
        }

        public StintBuilder but() {
            return aStint().withValue(value).withSid(sid).withStartTime(startTime).withEndTime(endTime).withDescription(description).withConversationPhaseType(conversationPhaseType);
        }

        public Stint build() {
            Stint stint = new Stint(value, sid, startTime, endTime, description, conversationPhaseType);
            return stint;
        }
    }
}
