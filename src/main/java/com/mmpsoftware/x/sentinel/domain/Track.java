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

    private Track(){

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
}
