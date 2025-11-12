package org.example;

import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class Student extends People{
    private final String group;
    private final Tutor tutor;
    private final Exams exams;

    public Student(int id, String firstName, String lastName, LocalDate birthdate, String email, String phoneNumber, String group, Tutor tutor, Exams exams) {
        super(id, firstName, lastName, birthdate, email, phoneNumber);
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
