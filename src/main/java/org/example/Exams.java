package org.example;

import lombok.Getter;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

@Getter
public class Exams {
    private final int id;
    private final String title;
    private final Subject subject;
    private final Instant date;
    private final int coefficient;


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
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Exams exams = (Exams) o;
        return id == exams.id && coefficient == exams.coefficient && Objects.equals(title, exams.title) && Objects.equals(subject, exams.subject) && Objects.equals(date, exams.date));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, subject, date, coefficient);
    }


}
