package com.mmpsoftware.x.sentinel.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ffazil
 * @since 05/12/15
 */
public class Dialogue {
    protected Set<Turn> turns = new HashSet<>(0);

    public Dialogue(Set<Turn> turns) {
        this.turns = turns;
    }

    public Dialogue(){

    }



    public void setTurns(Set<Turn> turns) {
        this.turns = turns;
    }

    public Set<Turn> getTurns() {
        return turns;
    }

    public static class DialogueBuilder {
        protected Set<Turn> turns = new HashSet<>(0);

        private DialogueBuilder() {
        }

        public static DialogueBuilder aDialogue() {
            return new DialogueBuilder();
        }

        public DialogueBuilder withTurns(Set<Turn> turns) {
            this.turns = turns;
            return this;
        }

        public DialogueBuilder but() {
            return aDialogue().withTurns(turns);
        }

        public Dialogue build() {
            Dialogue dialogue = new Dialogue(turns);
            return dialogue;
        }
    }
}
