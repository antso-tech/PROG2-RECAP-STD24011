package org.example;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class CalculateNotes {
    public List<Double> finalNoteCalculator(List<Note> notes){

        return Collections.singletonList(notes
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
                .reduce(0.0, Double::sum));
    }
}
