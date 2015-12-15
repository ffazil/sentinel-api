package com.mmpsoftware.x.sentinel.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

/**
 * @author ffazil
 * @since 05/12/15
 */
@Document(indexName = "recordingFiles")
public class RecordingFile {

    @Id
    private String uid;

    protected Track track;
    protected String sid;
    protected String type;
    protected String uri;
    protected Date recordedDateTime;
    protected Byte duration;
    protected String coding;
    protected Byte sampleSize;
    protected Short sampleRate;
    protected Byte nrOfTracks;

    private RecordingFile(){

    }

    public String getUid() {
        return uid;
    }

    public Track getTrack() {
        return track;
    }

    public String getSid() {
        return sid;
    }

    public String getType() {
        return type;
    }

    public String getUri() {
        return uri;
    }

    public Date getRecordedDateTime() {
        return recordedDateTime;
    }

    public Byte getDuration() {
        return duration;
    }

    public String getCoding() {
        return coding;
    }

    public Byte getSampleSize() {
        return sampleSize;
    }

    public Short getSampleRate() {
        return sampleRate;
    }

    public Byte getNrOfTracks() {
        return nrOfTracks;
    }
}
