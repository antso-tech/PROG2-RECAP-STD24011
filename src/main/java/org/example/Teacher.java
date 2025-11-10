package org.example;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Teacher {
    private Integer id;
    private String firstname;
    private LocalDate date;
    private String email;
    private String phoneNumber;
    private String group;
    private Tutor tutor;

    public Teacher(Integer id, String firstname, LocalDate date, String email, String phoneNumber, String group, Tutor tutor) {
        this.id = id;
        this.firstname = firstname;
        this.date = date;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.tutor = tutor;
    }
}
