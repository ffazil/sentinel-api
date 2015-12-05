package com.mmpsoftware.x.sentinel.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ffazil
 * @since 05/12/15
 */
public class Conversation {

    protected CallInfo callInfo;
    protected Set<Channel> channels = new HashSet<>(0);
    protected Set<RecordingFile> recordingFiles;
    protected Set<Speaker> speakers;
    protected Dialogue dialogue;
    protected Set<Stint> stints;
    protected String id;
    protected String source;
    protected String type;
    protected String subDomain;
    protected Date startTime;
    protected Integer duration;
    protected String version;
}
