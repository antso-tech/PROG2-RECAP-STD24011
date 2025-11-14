package org.example;

import java.time.Instant;
import java.util.List;

public class CalculatorFinalNote {

    public Double finalNoteCalculator(List<Note> notes){

        return notes
                .stream()
                .flatMapToDouble(n -> n
                        .getHistory()
                        .stream()
                        .reduce((a, b) -> b)
                        .stream()
                        .mapToDouble(e -> e
                                .getNote() * n.getExams()
                                .getCoefficient()))
                .boxed()
                .reduce(0.0, Double::sum) / 5;
    }



}
