package com.mmpsoftware.x.sentinel.domain;

/**
 * @author ffazil
 * @since 05/12/15
 */
public class ConversationPhase {

    protected String value;
    protected String type;
    protected Byte status;


    public ConversationPhase(String value, String type, Byte status) {
        this.value = value;
        this.type = type;
        this.status = status;
    }

    public ConversationPhase() {
    }

    public String getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    public Byte getStatus() {
        return status;
    }

    public static class ConversationPhaseBuilder {
        protected String value;
        protected String type;
        protected Byte status;

        private ConversationPhaseBuilder() {
        }

        public static ConversationPhaseBuilder aConversationPhase() {
            return new ConversationPhaseBuilder();
        }

        public ConversationPhaseBuilder withValue(String value) {
            this.value = value;
            return this;
        }

        public ConversationPhaseBuilder withType(String type) {
            this.type = type;
            return this;
        }

        public ConversationPhaseBuilder withStatus(Byte status) {
            this.status = status;
            return this;
        }

        public ConversationPhaseBuilder but() {
            return aConversationPhase().withValue(value).withType(type).withStatus(status);
        }

        public ConversationPhase build() {
            ConversationPhase conversationPhase = new ConversationPhase(value, type, status);
            return conversationPhase;
        }
    }
}
