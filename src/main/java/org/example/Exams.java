package org.example;

import lombok.Getter;
import java.time.Instant;

@Getter
public class Exams {
    int id;
    String title;
    Subject subject;
    Instant date;
    int coefficient;

    public Exams(int id, String title, Subject subject, Instant date, int coefficient) {
        this.id = id;
        this.title = title;
        this.subject = subject;
        this.date = date;
        this.coefficient = coefficient;
    }


}
