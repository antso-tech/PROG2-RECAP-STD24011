package org.example;

import java.util.List;

public class CalculateNotes {
    public List<Double> finalNoteCalculator(List<Note> notes){
        return notes.stream().map(e -> e.getInitialValue() * e.getExams().getCoefficient()).toList();
    }
}
