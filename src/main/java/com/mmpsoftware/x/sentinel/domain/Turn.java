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


    public Turn(ConversationPhase conversationPhase, Recognition recognition, String id, Integer sequenceNr, Float conversationTime, Integer recordingTime, Short duration, String trackPartId, String speakerId) {
        this.conversationPhase = conversationPhase;
        this.recognition = recognition;
        this.id = id;
        this.sequenceNr = sequenceNr;
        this.conversationTime = conversationTime;
        this.recordingTime = recordingTime;
        this.duration = duration;
        this.trackPartId = trackPartId;
        this.speakerId = speakerId;
    }

    public Turn() {
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

    public static class TurnBuilder {
        protected ConversationPhase conversationPhase;
        protected Recognition recognition;
        protected String id;
        protected Integer sequenceNr;
        protected Float conversationTime;
        protected Integer recordingTime;
        protected Short duration;
        protected String trackPartId;
        protected String speakerId;

        private TurnBuilder() {
        }

        public static TurnBuilder aTurn() {
            return new TurnBuilder();
        }

        public TurnBuilder withConversationPhase(ConversationPhase conversationPhase) {
            this.conversationPhase = conversationPhase;
            return this;
        }

        public TurnBuilder withRecognition(Recognition recognition) {
            this.recognition = recognition;
            return this;
        }

        public TurnBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public TurnBuilder withSequenceNr(Integer sequenceNr) {
            this.sequenceNr = sequenceNr;
            return this;
        }

        public TurnBuilder withConversationTime(Float conversationTime) {
            this.conversationTime = conversationTime;
            return this;
        }

        public TurnBuilder withRecordingTime(Integer recordingTime) {
            this.recordingTime = recordingTime;
            return this;
        }

        public TurnBuilder withDuration(Short duration) {
            this.duration = duration;
            return this;
        }

        public TurnBuilder withTrackPartId(String trackPartId) {
            this.trackPartId = trackPartId;
            return this;
        }

        public TurnBuilder withSpeakerId(String speakerId) {
            this.speakerId = speakerId;
            return this;
        }

        public TurnBuilder but() {
            return aTurn().withConversationPhase(conversationPhase).withRecognition(recognition).withId(id).withSequenceNr(sequenceNr).withConversationTime(conversationTime).withRecordingTime(recordingTime).withDuration(duration).withTrackPartId(trackPartId).withSpeakerId(speakerId);
        }

        public Turn build() {
            Turn turn = new Turn(conversationPhase, recognition, id, sequenceNr, conversationTime, recordingTime, duration, trackPartId, speakerId);
            return turn;
        }
    }
}
