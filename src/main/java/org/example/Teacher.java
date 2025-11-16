package org.example;

import lombok.Getter;

import java.time.LocalDate;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(Speciality, teacher.Speciality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Speciality);
    }


}
