package com.mmpsoftware.x.sentinel.util;

import com.mmpsoftware.x.sentinel.domain.*;
import com.mmpsoftware.x.sentinel.domain.Conversation;

import java.util.*;

/**
 * @author ffazil
 * @since 16/12/15
 */
public class ConversationAssembler {

    public Conversation from(com.mmpsoftware.x.sentinel.speech.schema.Conversation c){
        Conversation target = new Conversation();
        target.setSid(c.getId());
        target.setSource(c.getSource());
        target.setSubDomain(c.getSubDomain());
        target.setType(c.getType());
        target.setStartTime(c.getStartDateTime().toGregorianCalendar().getTime());
        target.setVersion(c.getVersion());
        target.setDuration(new Integer(c.getDuration()));

        target.setCallInfo(from(c.getCallInfo()));
        target.setChannels(from(c.getChannels()));
        target.setRecordingFiles(from(c.getRecordingFiles()));
        target.setStints(from(c.getStints()));
        target.setSpeakers(from(c.getSpeakers()));
        target.setDialogue(from(c.getDialogue()));

        return target;

    }

    private Dialogue from(com.mmpsoftware.x.sentinel.speech.schema.Conversation.Dialogue source) {
        Dialogue dialogue = Dialogue.DialogueBuilder.aDialogue()
                .withTurns(from(source.getTurn()))
                .build();
        return dialogue;
    }

    private Set<Turn> from(List<com.mmpsoftware.x.sentinel.speech.schema.Conversation.Dialogue.Turn> source) {
        Set<Turn> turns = new HashSet<>(0);
        source.forEach(s -> {
            Turn turn = Turn.TurnBuilder.aTurn()
                    .withConversationPhase(from(s.getConversationPhase()))
                    .withRecognition(from(s.getRecognition()))
                    .withId(s.getId())
                    .withSequenceNr(new Integer(s.getSequenceNr()))
                    .withConversationTime(s.getConversationTime())
                    .withRecordingTime(s.getRecordingTime())
                    .withDuration(s.getDuration())
                    .withTrackPartId(s.getTrackPartId())
                    .withSpeakerId(s.getSpeakerId())
                    .build();
            turns.add(turn);
        });
        return turns;
    }

    private Recognition from(com.mmpsoftware.x.sentinel.speech.schema.Conversation.Dialogue.Turn.Recognition source) {
        Recognition recognition = Recognition.RecognitionBuilder.aRecognition()
                .withUtterance(source.getUtterance())
                .withWords(fromWords(source.getWord()))
                .withId(source.getId())
                .withEngine(source.getEngine())
                .withContext(source.getContext())
                .withAcousticModel(source.getAcousticModel())
                .withRecognizedDateTime(source.getRecognizedDateTime().toGregorianCalendar().getTime())
                .withProcessingMs(source.getProcessingMs())
                .withRecogResult(source.getRecogResult())
                .build();
        return recognition;
    }

    private List<Word> fromWords(List<com.mmpsoftware.x.sentinel.speech.schema.Conversation.Dialogue.Turn.Recognition.Word> source) {
        List<Word> words = new ArrayList<>(0);
        source.forEach(s -> {
            Word word = Word.WordBuilder.aWord()
                    .withText(s.getText())
                    .withAltText(s.getAlt())
                    .withNr(s.getNr())
                    .withStartMs(s.getStartMs())
                    .withEndMs(s.getEndMs())
                    .withProb(s.getProb())
                    .build();
            words.add(word);
        });
        return words;
    }

    private ConversationPhase from(com.mmpsoftware.x.sentinel.speech.schema.Conversation.Dialogue.Turn.ConversationPhase source) {
        ConversationPhase conversationPhase = ConversationPhase.ConversationPhaseBuilder.aConversationPhase()
                .withStatus(source.getStatus())
                .withType(source.getType())
                .withValue(source.getValue())
                .build();
        return conversationPhase;
    }

    private Set<Speaker> from(com.mmpsoftware.x.sentinel.speech.schema.Conversation.Speakers source) {
        Set<Speaker> speakers = new HashSet<>(0);
        source.getSpeaker().forEach(s -> {
            Speaker speaker = Speaker.SpeakerBuilder.aSpeaker()
                    .withAcousticModel(s.getAcousticModel())
                    .withContext(s.getContext())
                    .withDescription(s.getDescription())
                    .withEmail(s.getEmail())
                    .withName(s.getName())
                    .withSex(s.getSex())
                    .withSid(s.getId())
                    .withType(s.getType())
                    .withValue(s.getValue())
                    .build();
            speakers.add(speaker);
        });
        return speakers;
    }

    private Set<Stint> from(com.mmpsoftware.x.sentinel.speech.schema.Conversation.Stints source) {
        Set<Stint> stints = new HashSet<>(0);
        Stint stint = Stint.StintBuilder.aStint()
                .withSid(source.getStint().getId())
                .withConversationPhaseType(source.getStint().getConversationPhaseType())
                .withDescription(source.getStint().getDescription())
                .withValue(source.getStint().getValue())
                .withStartTime(new Date(source.getStint().getStartTime().longValue()))
                .withEndTime(new Date(source.getStint().getEndTime()))
                .build();
        stints.add(stint);
        return stints;
    }

    private Set<RecordingFile> from(com.mmpsoftware.x.sentinel.speech.schema.Conversation.RecordingFiles source) {
        Set<RecordingFile> recordingFiles = new HashSet<>(0);
        RecordingFile recordingFile = RecordingFile.RecordingFileBuilder.aRecordingFile()
                .withCoding(source.getRecordingFile().getCoding())
                .withDuration(source.getRecordingFile().getDuration())
                .withNrOfTracks(source.getRecordingFile().getNrOfTracks())
                .withRecordedDateTime(source.getRecordingFile().getRecordedDateTime().toGregorianCalendar().getTime())
                .withSampleRate(source.getRecordingFile().getSampleRate())
                .withSampleSize(source.getRecordingFile().getSampleSize())
                .withSid(source.getRecordingFile().getId())
                .withType(source.getRecordingFile().getType())
                .withUri(source.getRecordingFile().getUri())
                .withTrack(from(source.getRecordingFile().getTrack()))
                .build();
        recordingFiles.add(recordingFile);
        return recordingFiles;
    }

    private Track from(com.mmpsoftware.x.sentinel.speech.schema.Conversation.RecordingFiles.RecordingFile.Track source) {
        Track track = Track.TrackBuilder.aTrack()
                .withId(source.getId())
                .withChannelList(source.getChannelList())
                .withNrInFile(source.getNrInFile())
                .withTrackPart(from(source.getTrackPart()))
                .build();
        return track;
    }

    private TrackPart from(com.mmpsoftware.x.sentinel.speech.schema.Conversation.RecordingFiles.RecordingFile.Track.TrackPart source) {
        TrackPart trackPart = TrackPart.TrackPartBuilder.aTrackPart()
                .withId(source.getId())
                .withValue(source.getValue())
                .build();
        return trackPart;
    }

    private Set<Channel> from(com.mmpsoftware.x.sentinel.speech.schema.Conversation.Channels source) {
        Set<Channel> channels = new HashSet<>(0);
        Channel channel = Channel.ChannelBuilder.aChannel()
                .withSid(source.getChannel().getId())
                .withName(source.getChannel().getName())
                .withSequenceNr(new Integer(source.getChannel().getSequenceNr()))
                .withRecorder(source.getChannel().getRecorder())
                .withValue(source.getChannel().getValue())
                .build();
        channels.add(channel);
        return channels;
    }

    private CallInfo from(com.mmpsoftware.x.sentinel.speech.schema.Conversation.CallInfo source) {
        CallInfo callInfo = CallInfo.CallInfoBuilder.aCallInfo()
                .withCallId(source.getCallId())
                .withCalled(source.getCalled())
                .withCli(source.getCli())
                .withDestination(source.getDestination())
                .withDestinationRoute(new Integer(source.getDestinationRoute()))
                .withDtmfInput(source.getDtmfInput())
                .withNode(new Integer(source.getNode()))
                .withPort(new Integer(source.getPort()))
                .withTimeslot(new Integer(source.getTimeslot()))
                .withTrunk(new Integer(source.getTrunk()))
                .withType(source.getType())
                .build();
        return callInfo;
    }
}
