package org.example;

import lombok.Getter;

import java.time.LocalDate;
import java.util.Objects;

@Getter
public class People {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final LocalDate birthdate;
    private final String email;
    private final String phoneNumber;

    public People(int id, String firstName, String lastName, LocalDate birthdate, String email, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate=" + birthdate +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return id == people.id && Objects.equals(firstName, people.firstName) && Objects.equals(lastName, people.lastName) && Objects.equals(birthdate, people.birthdate) && Objects.equals(email, people.email) && Objects.equals(phoneNumber, people.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, birthdate, email, phoneNumber);
    }
}
