package org.example;

import lombok.Getter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class Note {
    private final Integer initialValue;
    private final List<History> history;
    private final Subject subject;
    private final Student student;

    public Note(Integer initialValue, List<History> History, List<History> history, Subject subject, Student student) {
        this.initialValue = initialValue;
        this.history = Collections.singletonList(new History(initialValue, Instant.now(), ""));
        this.subject = subject;
        this.student = student;
    }

    public boolean addNewNote (){
        return history.add(history);

    }








}
