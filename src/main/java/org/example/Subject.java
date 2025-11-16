package org.example;

import lombok.Getter;

import java.time.Instant;
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

    public int getTotalCoefficient(){
        return exam.stream().map(Exam::getCoefficient).reduce(0, Integer::sum);
    }

    public double finalNoteCalculator(Student student){
        var notesByStudents = exam.stream()
                .map(e -> e.getNote()
                        .stream().filter(s -> s.getStudent() == student)
                        .map(n  -> n.getHistory()
                                .stream()
                                .max(Comparator.comparing(History::getTime))
                                .map(h -> h.getNote() * e.getCoefficient())).toList())
                .toList();
        var sumOfnotes = notesByStudents
                .stream().
                flatMap(List::stream)
                .flatMap(Optional::stream)
                .mapToDouble(Double::doubleValue)
                .sum() / getTotalCoefficient();

        return Math.round(sumOfnotes * 100.0) / 100.0;
    }


    public Double getCourseGrade(Student student, Instant t){
        var courseGrade = exam.stream()
                .flatMap(e -> e.getNote()
                        .stream()
                        .filter(s -> s
                                .getStudent()
                                .equals(student))
                        .flatMap(n -> n.getHistory().stream()
                                .filter(h -> h.getTime().isBefore(t))
                                .map(h -> h.getNote() * e.getCoefficient())))
                .reduce(0.0, Double::sum) / getTotalCoefficient();

        return Math.round(courseGrade * 100.0) /100.0;
    }
}
