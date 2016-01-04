package com.mmpsoftware.x.sentinel.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

/**
 * @author ffazil
 * @since 05/12/15
 */
public class RecordingFile {

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

    public RecordingFile(Track track, String sid, String type, String uri, Date recordedDateTime, Byte duration, String coding, Byte sampleSize, Short sampleRate, Byte nrOfTracks) {
        this.track = track;
        this.sid = sid;
        this.type = type;
        this.uri = uri;
        this.recordedDateTime = recordedDateTime;
        this.duration = duration;
        this.coding = coding;
        this.sampleSize = sampleSize;
        this.sampleRate = sampleRate;
        this.nrOfTracks = nrOfTracks;
    }

    public RecordingFile() {
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public void setRecordedDateTime(Date recordedDateTime) {
        this.recordedDateTime = recordedDateTime;
    }

    public void setDuration(Byte duration) {
        this.duration = duration;
    }

    public void setCoding(String coding) {
        this.coding = coding;
    }

    public void setSampleSize(Byte sampleSize) {
        this.sampleSize = sampleSize;
    }

    public void setSampleRate(Short sampleRate) {
        this.sampleRate = sampleRate;
    }

    public void setNrOfTracks(Byte nrOfTracks) {
        this.nrOfTracks = nrOfTracks;
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

    public static class RecordingFileBuilder {
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

        private RecordingFileBuilder() {
        }

        public static RecordingFileBuilder aRecordingFile() {
            return new RecordingFileBuilder();
        }

        public RecordingFileBuilder withTrack(Track track) {
            this.track = track;
            return this;
        }

        public RecordingFileBuilder withSid(String sid) {
            this.sid = sid;
            return this;
        }

        public RecordingFileBuilder withType(String type) {
            this.type = type;
            return this;
        }

        public RecordingFileBuilder withUri(String uri) {
            this.uri = uri;
            return this;
        }

        public RecordingFileBuilder withRecordedDateTime(Date recordedDateTime) {
            this.recordedDateTime = recordedDateTime;
            return this;
        }

        public RecordingFileBuilder withDuration(Byte duration) {
            this.duration = duration;
            return this;
        }

        public RecordingFileBuilder withCoding(String coding) {
            this.coding = coding;
            return this;
        }

        public RecordingFileBuilder withSampleSize(Byte sampleSize) {
            this.sampleSize = sampleSize;
            return this;
        }

        public RecordingFileBuilder withSampleRate(Short sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }

        public RecordingFileBuilder withNrOfTracks(Byte nrOfTracks) {
            this.nrOfTracks = nrOfTracks;
            return this;
        }

        public RecordingFileBuilder but() {
            return aRecordingFile().withTrack(track).withSid(sid).withType(type).withUri(uri).withRecordedDateTime(recordedDateTime).withDuration(duration).withCoding(coding).withSampleSize(sampleSize).withSampleRate(sampleRate).withNrOfTracks(nrOfTracks);
        }

        public RecordingFile build() {
            RecordingFile recordingFile = new RecordingFile(track, sid, type, uri, recordedDateTime, duration, coding, sampleSize, sampleRate, nrOfTracks);
            return recordingFile;
        }
    }
}
