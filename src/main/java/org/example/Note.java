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
    private final Student student;
    private final Exams exams;
    private final List<History> history;

    public Note(Double initialValue, Subject subject, Student student, Exams exams) {
        this.initialValue = initialValue;
        this.subject = subject;
        this.student = student;
        this.history = new ArrayList<>();
        this.exams = exams;
        history.add(new History(initialValue,Instant.now(),"first note"));
    }

    @Override
    public String toString() {
        return "Note{" +
                "initialValue=" + initialValue +
                ", subject=" + subject +
                ", student=" + student +
                ", exams=" + exams +
                ", history=" + history +
                '}';
    }

    public void changeNote (History newNote){
        history.add(newNote);

    }


}
