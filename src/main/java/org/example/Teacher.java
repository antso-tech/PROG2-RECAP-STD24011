package org.example;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Teacher extends People{
    private final String Speciality ;

    public Teacher(int id, String firstName, String lastName, LocalDate birthdate, String email, String phoneNumber, String speciality) {
        super(id, firstName, lastName, birthdate, email, phoneNumber);
        Speciality = speciality;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                ", Speciality='" + Speciality + '\'' +
                '}';
    }
}
