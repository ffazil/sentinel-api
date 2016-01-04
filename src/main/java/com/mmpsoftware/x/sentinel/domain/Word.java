package com.mmpsoftware.x.sentinel.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ffazil
 * @since 05/12/15
 */
public class Word {

    protected String text;
    protected List<String> altText = new ArrayList<>(0);
    protected Byte nr;
    protected Short startMs;
    protected Short endMs;
    protected Float prob;


    public Word(String text, List<String> altText, Byte nr, Short startMs, Short endMs, Float prob) {
        this.text = text;
        this.altText = altText;
        this.nr = nr;
        this.startMs = startMs;
        this.endMs = endMs;
        this.prob = prob;
    }

    public Word() {
    }

    public String getText() {
        return text;
    }

    public List<String> getAltText() {
        return altText;
    }

    public Byte getNr() {
        return nr;
    }

    public Short getStartMs() {
        return startMs;
    }

    public Short getEndMs() {
        return endMs;
    }

    public Float getProb() {
        return prob;
    }

    public static class WordBuilder {
        protected String text;
        protected List<String> altText = new ArrayList<>(0);
        protected Byte nr;
        protected Short startMs;
        protected Short endMs;
        protected Float prob;

        private WordBuilder() {
        }

        public static WordBuilder aWord() {
            return new WordBuilder();
        }

        public WordBuilder withText(String text) {
            this.text = text;
            return this;
        }

        public WordBuilder withAltText(List<String> altText) {
            this.altText = altText;
            return this;
        }

        public WordBuilder withNr(Byte nr) {
            this.nr = nr;
            return this;
        }

        public WordBuilder withStartMs(Short startMs) {
            this.startMs = startMs;
            return this;
        }

        public WordBuilder withEndMs(Short endMs) {
            this.endMs = endMs;
            return this;
        }

        public WordBuilder withProb(Float prob) {
            this.prob = prob;
            return this;
        }

        public WordBuilder but() {
            return aWord().withText(text).withAltText(altText).withNr(nr).withStartMs(startMs).withEndMs(endMs).withProb(prob);
        }

        public Word build() {
            Word word = new Word(text, altText, nr, startMs, endMs, prob);
            return word;
        }
    }
}
