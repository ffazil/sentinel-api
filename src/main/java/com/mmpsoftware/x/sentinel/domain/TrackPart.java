package com.mmpsoftware.x.sentinel.domain;

/**
 * @author ffazil
 * @since 05/12/15
 */
public class TrackPart {

    protected String value;
    protected String id;

    public TrackPart(String value, String id) {
        this.value = value;
        this.id = id;
    }

    public TrackPart() {
    }

    public String getValue() {
        return value;
    }

    public String getId() {
        return id;
    }

    public static class TrackPartBuilder {
        protected String value;
        protected String id;

        private TrackPartBuilder() {
        }

        public static TrackPartBuilder aTrackPart() {
            return new TrackPartBuilder();
        }

        public TrackPartBuilder withValue(String value) {
            this.value = value;
            return this;
        }

        public TrackPartBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public TrackPartBuilder but() {
            return aTrackPart().withValue(value).withId(id);
        }

        public TrackPart build() {
            TrackPart trackPart = new TrackPart(value, id);
            return trackPart;
        }
    }
}
