package org.example;

import lombok.Getter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
public class Note {
    private final Double initialValue;
    private final List<History> history;
    private final Student student;

    public Note(Double initialValue, Student student) {
        this.initialValue = initialValue;
        this.student = student;

        this.history = new ArrayList<>();
        history.add(new History(initialValue, Instant.now(), "first note"));
    }

    @Override
    public String toString() {
        return "Note{" +
                "initialValue=" + initialValue +
                ", history=" + history +
                '}';
    }

    public void changeNote(History newNote) {
        history.add(newNote);

    }

    public List<History> getHistory(){
        return new ArrayList<>(history);
    }


}
