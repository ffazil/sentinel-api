package com.mmpsoftware.x.sentinel.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author ffazil
 * @since 05/12/15
 */
public class Channel {

    protected String value;
    protected String sid;
    protected Integer sequenceNr;
    protected String name;
    protected String recorder;

    public Channel(String value, String sid, Integer sequenceNr, String name, String recorder) {
        this.value = value;
        this.sid = sid;
        this.sequenceNr = sequenceNr;
        this.name = name;
        this.recorder = recorder;
    }

    public Channel() {
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setSequenceNr(Integer sequenceNr) {
        this.sequenceNr = sequenceNr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder;
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

    public static class ChannelBuilder {
        protected String value;
        protected String sid;
        protected Integer sequenceNr;
        protected String name;
        protected String recorder;

        private ChannelBuilder() {
        }

        public static ChannelBuilder aChannel() {
            return new ChannelBuilder();
        }

        public ChannelBuilder withValue(String value) {
            this.value = value;
            return this;
        }

        public ChannelBuilder withSid(String sid) {
            this.sid = sid;
            return this;
        }

        public ChannelBuilder withSequenceNr(Integer sequenceNr) {
            this.sequenceNr = sequenceNr;
            return this;
        }

        public ChannelBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ChannelBuilder withRecorder(String recorder) {
            this.recorder = recorder;
            return this;
        }

        public ChannelBuilder but() {
            return aChannel().withValue(value).withSid(sid).withSequenceNr(sequenceNr).withName(name).withRecorder(recorder);
        }

        public Channel build() {
            Channel channel = new Channel(value, sid, sequenceNr, name, recorder);
            return channel;
        }
    }
}
