package org.example;

import lombok.Getter;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

@Getter
public class Exams {
    private final int id;
    private final String title;
    private final Instant date;
    private final int coefficient;
    private final List<Note> note;



    public Exams(int id, String title, Instant date, int coefficient, List<Note> note) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.coefficient = coefficient;
        this.note = note;
    }

    @Override
    public String toString() {
        return "Exams{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", coefficient=" + coefficient +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Exams exams = (Exams) o;
        return id == exams.id && coefficient == exams.coefficient && Objects.equals(title, exams.title) && Objects.equals(date, exams.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, date, coefficient);
    }


}
