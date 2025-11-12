package org.example;

import lombok.Getter;

import java.time.LocalDate;

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
}
