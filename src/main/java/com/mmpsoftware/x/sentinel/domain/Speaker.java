package com.mmpsoftware.x.sentinel.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author ffazil
 * @since 05/12/15
 */
public class Speaker {

    protected String value;
    protected String acousticModel;
    protected String context;
    protected String description;
    protected String sid;
    protected String sex;
    protected String email;
    protected String name;
    protected String type;

    public Speaker(String value, String acousticModel, String context, String description, String sid, String sex, String email, String name, String type) {
        this.value = value;
        this.acousticModel = acousticModel;
        this.context = context;
        this.description = description;
        this.sid = sid;
        this.sex = sex;
        this.email = email;
        this.name = name;
        this.type = type;
    }

    public Speaker() {
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

    public static class SpeakerBuilder {
        protected String value;
        protected String acousticModel;
        protected String context;
        protected String description;
        protected String sid;
        protected String sex;
        protected String email;
        protected String name;
        protected String type;

        private SpeakerBuilder() {
        }

        public static SpeakerBuilder aSpeaker() {
            return new SpeakerBuilder();
        }

        public SpeakerBuilder withValue(String value) {
            this.value = value;
            return this;
        }

        public SpeakerBuilder withAcousticModel(String acousticModel) {
            this.acousticModel = acousticModel;
            return this;
        }

        public SpeakerBuilder withContext(String context) {
            this.context = context;
            return this;
        }

        public SpeakerBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public SpeakerBuilder withSid(String sid) {
            this.sid = sid;
            return this;
        }

        public SpeakerBuilder withSex(String sex) {
            this.sex = sex;
            return this;
        }

        public SpeakerBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public SpeakerBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public SpeakerBuilder withType(String type) {
            this.type = type;
            return this;
        }

        public SpeakerBuilder but() {
            return aSpeaker().withValue(value).withAcousticModel(acousticModel).withContext(context).withDescription(description).withSid(sid).withSex(sex).withEmail(email).withName(name).withType(type);
        }

        public Speaker build() {
            Speaker speaker = new Speaker(value, acousticModel, context, description, sid, sex, email, name, type);
            return speaker;
        }
    }
}
