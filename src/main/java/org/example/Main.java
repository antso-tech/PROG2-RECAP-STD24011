package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Teacher James = new Teacher(1,"Frances","James", LocalDate.of(1990,11,6),"james@gmail.com","01 23 45 67 89","Backend");
        Tutor Elisa = new Tutor(1,"Bryar","Elisa","ElisaBryar04@gmail.com","11 14 05 78 20","mére de l'etudiant");
        Student Emily = new Student(1, "Bryar", LocalDate.of(2005,6,15),"emilyBryar.hei.4@gmail.com","24 79 89 90 70","F1",Elisa);
        Subject PROG1 = new Subject(1,Label.PROG1,8,James);
        History history1 = new History(13, Instant.parse("2025-11-12T08:37:00Z"),"Pénalité aprés avoir non fini un devoir ");
        History history2 = new History(15,Instant.parse("2025-11-16T06:16:00Z"),"bonus pour bonne conduite");
        Note firstExamNote = new Note(16, List.of(history1,history2),Emily,PROG1);

    }
}