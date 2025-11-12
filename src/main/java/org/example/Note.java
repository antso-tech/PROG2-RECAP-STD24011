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
    private final Exams exams;
    private List<History> history;

    public Note(Integer initialValue, Subject subject, Student student, Exams exams) {
        this.initialValue = initialValue;
        this.subject = subject;
        this.student = student;
        this.history = Collections.singletonList(new History(initialValue, Instant.now(), ""));
        this.exams = exams;
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
