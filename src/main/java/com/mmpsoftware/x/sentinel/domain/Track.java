package com.mmpsoftware.x.sentinel.domain;

/**
 * @author ffazil
 * @since 05/12/15
 */
public class Track {

    protected TrackPart trackPart;
    protected String id;
    protected Byte nrInFile;
    protected String channelList;

    public Track(TrackPart trackPart, String id, Byte nrInFile, String channelList) {
        this.trackPart = trackPart;
        this.id = id;
        this.nrInFile = nrInFile;
        this.channelList = channelList;
    }

    public Track() {
    }

    public TrackPart getTrackPart() {
        return trackPart;
    }

    public String getId() {
        return id;
    }

    public Byte getNrInFile() {
        return nrInFile;
    }

    public String getChannelList() {
        return channelList;
    }

    public static class TrackBuilder {
        protected TrackPart trackPart;
        protected String id;
        protected Byte nrInFile;
        protected String channelList;

        private TrackBuilder() {
        }

        public static TrackBuilder aTrack() {
            return new TrackBuilder();
        }

        public TrackBuilder withTrackPart(TrackPart trackPart) {
            this.trackPart = trackPart;
            return this;
        }

        public TrackBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public TrackBuilder withNrInFile(Byte nrInFile) {
            this.nrInFile = nrInFile;
            return this;
        }

        public TrackBuilder withChannelList(String channelList) {
            this.channelList = channelList;
            return this;
        }

        public TrackBuilder but() {
            return aTrack().withTrackPart(trackPart).withId(id).withNrInFile(nrInFile).withChannelList(channelList);
        }

        public Track build() {
            Track track = new Track(trackPart, id, nrInFile, channelList);
            return track;
        }
    }
}
