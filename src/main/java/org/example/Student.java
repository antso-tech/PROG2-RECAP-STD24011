package org.example;

import lombok.Getter;

import java.time.LocalDate;

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
}
