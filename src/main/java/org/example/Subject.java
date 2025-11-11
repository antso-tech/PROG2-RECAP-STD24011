package org.example;

import lombok.Getter;


@Getter
public class Subject {
    private Integer id;
    private Label label;
    private Integer credit;
    private Student teacher;

    public Subject(Integer id, Label label, Integer credit, Student teacher) {
        this.id = id;
        this.label = label;
        this.credit = credit;
        this.teacher = teacher;
    }


}
