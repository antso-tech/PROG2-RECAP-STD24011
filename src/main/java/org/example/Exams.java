package org.example;

import lombok.Getter;
import java.time.Instant;
import java.util.Optional;

@Getter
public class Exams {
    private final int id;
    private final String title;
    private final Subject subject;
    private final Instant date;
    private final int coefficient;
    private Note notes;

    public Exams(int id, String title, Subject subject, Instant date, int coefficient) {
        this.id = id;
        this.title = title;
        this.subject = subject;
        this.date = date;
        this.coefficient = coefficient;
    }

    @Override
    public String toString() {
        return "Exams{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subject=" + subject +
                ", date=" + date +
                ", coefficient=" + coefficient +
                ", notes=" + notes +
                '}';
    }
}
