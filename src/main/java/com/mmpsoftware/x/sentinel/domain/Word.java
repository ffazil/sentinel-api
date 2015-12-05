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

}
