package com.mmpsoftware.x.sentinel.domain;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ffazil
 * @since 05/12/15
 */
@Document(indexName = "conversations")
@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public class Conversation {

    @Id
    private String uid;

    protected CallInfo callInfo;
    protected Set<Channel> channels = new HashSet<>(0);
    protected Set<RecordingFile> recordingFiles;
    protected Set<Speaker> speakers;
    protected Dialogue dialogue;
    protected Set<Stint> stints;
    protected String sid;
    protected String source;
    protected String type;
    protected String subDomain;
    protected Date startTime;
    protected Integer duration;
    protected String version;

    public Conversation(){

    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setCallInfo(CallInfo callInfo) {
        this.callInfo = callInfo;
    }

    public void setChannels(Set<Channel> channels) {
        this.channels = channels;
    }

    public void setRecordingFiles(Set<RecordingFile> recordingFiles) {
        this.recordingFiles = recordingFiles;
    }

    public void setSpeakers(Set<Speaker> speakers) {
        this.speakers = speakers;
    }

    public void setDialogue(Dialogue dialogue) {
        this.dialogue = dialogue;
    }

    public void setStints(Set<Stint> stints) {
        this.stints = stints;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSubDomain(String subDomain) {
        this.subDomain = subDomain;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUid() {
        return uid;
    }

    public CallInfo getCallInfo() {
        return callInfo;
    }

    public Set<Channel> getChannels() {
        return channels;
    }

    public Set<RecordingFile> getRecordingFiles() {
        return recordingFiles;
    }

    public Set<Speaker> getSpeakers() {
        return speakers;
    }

    public Dialogue getDialogue() {
        return dialogue;
    }

    public Set<Stint> getStints() {
        return stints;
    }

    public String getSid() {
        return sid;
    }

    public String getSource() {
        return source;
    }

    public String getType() {
        return type;
    }

    public String getSubDomain() {
        return subDomain;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getVersion() {
        return version;
    }
}
