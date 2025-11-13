package org.example;

import java.util.List;
import java.util.Optional;

public class CalculateNotes {
    public List<Optional<Double>> finalNoteCalculator(List<Note> notes){

        return notes
                .stream()
                .map(e -> e.getHistory()
                        .stream()
                        .map(History::getNote)
                        .reduce((first,last) -> last)).toList();
    }
}
