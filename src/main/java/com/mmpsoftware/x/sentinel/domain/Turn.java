package com.mmpsoftware.x.sentinel.domain;

/**
 * @author ffazil
 * @since 05/12/15
 */
public class Turn {

    protected ConversationPhase conversationPhase;
    protected Recognition recognition;
    protected String id;
    protected Integer sequenceNr;
    protected Float conversationTime;
    protected Integer recordingTime;
    protected Short duration;
    protected String trackPartId;
    protected String speakerId;



    private Turn(){

    }

    public ConversationPhase getConversationPhase() {
        return conversationPhase;
    }

    public Recognition getRecognition() {
        return recognition;
    }

    public String getId() {
        return id;
    }

    public Integer getSequenceNr() {
        return sequenceNr;
    }

    public Float getConversationTime() {
        return conversationTime;
    }

    public Integer getRecordingTime() {
        return recordingTime;
    }

    public Short getDuration() {
        return duration;
    }

    public String getTrackPartId() {
        return trackPartId;
    }

    public String getSpeakerId() {
        return speakerId;
    }
}
