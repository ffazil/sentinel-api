package com.mmpsoftware.x.sentinel.domain;

import java.util.Date;

/**
 * @author ffazil
 * @since 05/12/15
 */
public class RecordingFile {

    protected Track track;
    protected String id;
    protected String type;
    protected String uri;
    protected Date recordedDateTime;
    protected Byte duration;
    protected String coding;
    protected Byte sampleSize;
    protected Short sampleRate;
    protected Byte nrOfTracks;

}
