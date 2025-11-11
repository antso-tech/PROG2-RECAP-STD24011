package org.example;

import lombok.Getter;
import java.time.Instant;
import java.util.List;

@Getter
public class Exams {
    private final int id;
    String title;
    Subject subject;
    Instant date;
    int coefficient;
    List<Note> notes;

    public Exams(int id, String title, Subject subject, Instant date, int coefficient) {
        this.id = id;
        this.title = title;
        this.subject = subject;
        this.date = date;
        this.coefficient = coefficient;
    }

    public List<Integer> finalNote(){
        return notes.stream().map(Note::getInitialValue).toList();
    }



}
