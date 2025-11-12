package org.example;

import lombok.Getter;

import java.time.LocalDate;
import java.util.Objects;

@Getter
public class Student extends People{
    private final String group;
    private final Tutor tutor;

    public Student(int id, String firstName, String lastName, LocalDate birthdate, String email, String phoneNumber, String group, Tutor tutor) {
        super(id, firstName, lastName, birthdate, email, phoneNumber);
        this.group = group;
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "group='" + group + '\'' +
                ", tutor=" + tutor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(group, student.group) && Objects.equals(tutor, student.tutor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), group, tutor);
    }
}
