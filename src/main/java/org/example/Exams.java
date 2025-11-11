package org.example;

import lombok.Getter;
import java.time.Instant;
import java.util.List;

@Getter
public class Exams {
    private final int id;
    private final String title;
    private final Subject subject;
    private final Instant date;
    private final int coefficient;
    private List<Note> notes;

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
