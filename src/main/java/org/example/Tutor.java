package org.example;

import lombok.Getter;

@Getter
public class Tutor {
    private final Integer id;
    private final String lastname;
    private final String firstname;
    private final String email;
    private final String phoneNumber;
    private final String description;

    public Tutor(Integer id, String lastname, String firstname, String email, String phoneNumber, String description) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.description = description;
    }


}
