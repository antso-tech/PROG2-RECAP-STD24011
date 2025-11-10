package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Subject {
    private Integer id;
    private String label;
    private Integer credit;
    private Teacher teacher;

    public Subject(Integer id, String label, Integer credit, Teacher teacher) {
        this.id = id;
        this.label = label;
        this.credit = credit;
        this.teacher = teacher;
    }
}
