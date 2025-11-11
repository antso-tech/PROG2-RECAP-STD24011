package org.example;

import lombok.Getter;


@Getter
public class Subject {
    private final Integer id;
    private final Label label;
    private final Integer credit;
    private final Student teacher;

    public Subject(Integer id, Label label, Integer credit, Student teacher) {
        this.id = id;
        this.label = label;
        this.credit = credit;
        this.teacher = teacher;
    }


}
