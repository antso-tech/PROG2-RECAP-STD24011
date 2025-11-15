package org.example;

import lombok.Getter;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Getter
public class Subject {
    private final Integer id;
    private final Label label;
    private final Integer credit;
    private final Teacher teacher;
    private final List<Exam> exam;

    public Subject(Integer id, Label label, Integer credit, Teacher teacher, List<Exam> exam) {
        this.id = id;
        this.label = label;
        this.credit = credit;
        this.teacher = teacher;
        this.exam = exam;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", label=" + label +
                ", credit=" + credit +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(id, subject.id) && label == subject.label && Objects.equals(credit, subject.credit) && Objects.equals(teacher, subject.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, credit, teacher);
    }

    public double finalNoteCalculator(Student student){
        var notesByStudents =    exam.stream()
                .map(e -> e.getNote()
                        .stream().filter(s -> s.getStudent() == student)
                        .map(n  -> n.getHistory()
                                .stream()
                                .max(Comparator.comparing(History::getTime))
                                .map(h -> h.getNote() * e.getCoefficient())).toList())
                .toList();
        return notesByStudents
                .stream().
                flatMap(List::stream)
                .flatMap(Optional::stream)
                .mapToDouble(Double::doubleValue)
                .sum() / 5;

    }
}
