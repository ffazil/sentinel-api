package com.mmpsoftware.x.sentinel.domain;

/**
 * @author ffazil
 * @since 05/12/15
 */
public class ConversationPhase {

    protected String value;
    protected String type;
    protected Byte status;


    private ConversationPhase(){

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
}
