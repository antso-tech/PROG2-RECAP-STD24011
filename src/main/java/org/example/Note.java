package org.example;

import lombok.Getter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Getter
public class Note {
    private final Double initialValue;
    private final Subject subject;
    private final List<History> history;

    public Note(Double initialValue, Subject subject) {
        this.initialValue = initialValue;
        this.subject = subject;
        this.history = new ArrayList<>();

        history.add(new History(initialValue,Instant.now(),"first note"));
    }

    @Override
    public String toString() {
        return "Note{" +
                "initialValue=" + initialValue +
                ", subject=" + subject +
                ", history=" + history +
                '}';
    }

    public void changeNote (History newNote){
        history.add(newNote);

    }


}
