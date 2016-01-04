package com.mmpsoftware.x.sentinel.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ffazil
 * @since 05/12/15
 */
public class Recognition {

    protected String utterance;
    protected List<Word> words = new ArrayList<>(0);
    protected String id;
    protected String engine;
    protected String context;
    protected String acousticModel;
    protected Date recognizedDateTime;
    protected Short processingMs;
    protected String recogResult;

    public Recognition(String utterance, List<Word> words, String id, String engine, String context, String acousticModel, Date recognizedDateTime, Short processingMs, String recogResult) {
        this.utterance = utterance;
        this.words = words;
        this.id = id;
        this.engine = engine;
        this.context = context;
        this.acousticModel = acousticModel;
        this.recognizedDateTime = recognizedDateTime;
        this.processingMs = processingMs;
        this.recogResult = recogResult;
    }

    public Recognition() {
    }

    public String getUtterance() {
        return utterance;
    }

    public List<Word> getWords() {
        return words;
    }

    public String getId() {
        return id;
    }

    public String getEngine() {
        return engine;
    }

    public String getContext() {
        return context;
    }

    public String getAcousticModel() {
        return acousticModel;
    }

    public Date getRecognizedDateTime() {
        return recognizedDateTime;
    }

    public Short getProcessingMs() {
        return processingMs;
    }

    public String getRecogResult() {
        return recogResult;
    }

    public static class RecognitionBuilder {
        protected String utterance;
        protected List<Word> words = new ArrayList<>(0);
        protected String id;
        protected String engine;
        protected String context;
        protected String acousticModel;
        protected Date recognizedDateTime;
        protected Short processingMs;
        protected String recogResult;

        private RecognitionBuilder() {
        }

        public static RecognitionBuilder aRecognition() {
            return new RecognitionBuilder();
        }

        public RecognitionBuilder withUtterance(String utterance) {
            this.utterance = utterance;
            return this;
        }

        public RecognitionBuilder withWords(List<Word> words) {
            this.words = words;
            return this;
        }

        public RecognitionBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public RecognitionBuilder withEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public RecognitionBuilder withContext(String context) {
            this.context = context;
            return this;
        }

        public RecognitionBuilder withAcousticModel(String acousticModel) {
            this.acousticModel = acousticModel;
            return this;
        }

        public RecognitionBuilder withRecognizedDateTime(Date recognizedDateTime) {
            this.recognizedDateTime = recognizedDateTime;
            return this;
        }

        public RecognitionBuilder withProcessingMs(Short processingMs) {
            this.processingMs = processingMs;
            return this;
        }

        public RecognitionBuilder withRecogResult(String recogResult) {
            this.recogResult = recogResult;
            return this;
        }

        public RecognitionBuilder but() {
            return aRecognition().withUtterance(utterance).withWords(words).withId(id).withEngine(engine).withContext(context).withAcousticModel(acousticModel).withRecognizedDateTime(recognizedDateTime).withProcessingMs(processingMs).withRecogResult(recogResult);
        }

        public Recognition build() {
            Recognition recognition = new Recognition(utterance, words, id, engine, context, acousticModel, recognizedDateTime, processingMs, recogResult);
            return recognition;
        }
    }
}
