package org.example;

import lombok.Getter;

import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(initialValue, note.initialValue) && Objects.equals(subject, note.subject) && Objects.equals(student, note.student) && Objects.equals(exams, note.exams) && Objects.equals(history, note.history);
    }

    @Override
    public int hashCode() {
        return Objects.hash(initialValue, subject, student, exams, history);
    }

    public void changeNote (History newNote){
        history.add(newNote);

    }


}
