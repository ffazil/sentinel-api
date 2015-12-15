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


    private Word(){

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
}
