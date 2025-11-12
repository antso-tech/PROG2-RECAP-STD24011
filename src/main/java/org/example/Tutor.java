package org.example;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Tutor extends People{
    private final String description;

    public Tutor(int id, String firstName, String lastName, LocalDate birthdate, String email, String phoneNumber, String description) {
        super(id, firstName, lastName, birthdate, email, phoneNumber);
        this.description = description;
    }

    @Override
    public String toString() {
        return "Tutor{" + super.toString() +
                "description='" + description + '\'' +
                '}';
    }
}
