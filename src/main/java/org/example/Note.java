package org.example;

import lombok.Getter;

import java.time.Instant;
import java.util.Collections;
import java.util.List;

@Getter
public class Note {
    private final Integer initialValue;
    private final Subject subject;
    private final Student student;
    private List<History> history;

    public Note(Integer initialValue, Subject subject, Student student, List<History> history) {
        this.initialValue = initialValue;
        this.subject = subject;
        this.student = student;
        this.history = Collections.singletonList(new History(initialValue, Instant.now(), ""));
    }

    public boolean addNewNote (History newNote){
        return history.add(newNote);

    }








}
