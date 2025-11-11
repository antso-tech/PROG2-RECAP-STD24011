package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
public class Note {
    private final Integer initialValue;
    private List<Integer> changeHistory;

    public Note(Integer initialValue, List<Integer> changeHistory) {
        this.initialValue = initialValue;
        this.changeHistory = changeHistory;
    }
}
