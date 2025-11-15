package org.example;

import lombok.Getter;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;


@Getter
public class Subject {
    private final Integer id;
    private final Label label;
    private final Integer credit;
    private final Teacher teacher;
    private final List<Exams> exam;

    public Subject(Integer id, Label label, Integer credit, Teacher teacher, List<Exams> exam) {
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

    public List<Stream<Stream<Double>>> finalNoteCalculator(){
        return exam.stream().map(e -> e.getNote().stream().map(h -> h
                .getHistory()
                .stream()
                .map(History::getNote)))
                .toList();
                }
}
