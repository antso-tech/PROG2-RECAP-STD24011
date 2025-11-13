package org.example;

import java.util.List;

public class CalculateNotes {
    private List<Note> note;
    public List<Double> finalNoteCalculator(){
        return note.stream().map(Note::getInitialValue).toList();
    }
}
