package org.example;

import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class Student {
    private final Integer id;
    private final String lastName;
    private final String firstname;
    private final LocalDate BirthDate;
    private final String email;
    private final String phoneNumber;
    private final String group;
    private final Tutor tutor;
    private final Exams exams;

    public Student(Integer id, String lastName, String firstname, LocalDate birthDate, String email, String phoneNumber, String group, Tutor tutor, Exams exams) {
        this.id = id;
        this.lastName = lastName;
        this.firstname = firstname;
        this.BirthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.tutor = tutor;
        this.exams = exams;
    }

    public Integer finalNote (){
        if(getExams().getNotes().getHistory().isEmpty()){
            return getExams().getNotes().getInitialValue();
        }
    }
}
