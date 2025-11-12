package org.example;

import lombok.Getter;

import java.util.List;

@Getter
public class Note {
    private final Integer initialValue;
    private final List<History> History;
    private final Student student;
    private final Subject subject;


    public Note(Integer initialValue, List<History> History, Student student, Subject subject ) {
        this.initialValue = initialValue;
        this.History = History;
        this.student = student;
        this.subject = subject
    }


}
