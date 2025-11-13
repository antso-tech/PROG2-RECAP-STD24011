package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Teacher James = new Teacher(1,"Frances","James"
                , LocalDate.of(1990,11,6),"james@gmail.com"
                ,"01 23 45 67 89","FullStack");
        Teacher Danielle = new Teacher(2,"John","Danielle"
                ,LocalDate.of(1996,5,8),"DanielleJohn@gmail.com"
                ,"34 67 18 10 60","Front End");
        Tutor Elisa = new Tutor(1,"Bryar","Elisa"
                ,LocalDate.of(1980,12,8),"ElisaBryar04@gmail.com"
                ,"11 14 05 78 20","mére de l'etudiant");
        Tutor Gabriel = new Tutor(1, "Francois","Gabriel"
                ,LocalDate.of(1985,6,12), "GabrielFrancois@gmail.com"
                ,"33 77 78 89 67","Pere de l'étudiant");
        Student Emily = new Student(1, "Bryar","Emily"
                ,LocalDate.of(2005,6,15),"emilyBryar.hei.4@gmail.com","24 79 89 90 70","F1",Elisa);
        Student Jean = new Student(2, "Francois","Jean"
                , LocalDate.of(2004,9,18),"JeanFrancois14@gmail.com"
                ,"14 69 17 05 89","F3",Gabriel);
        Subject PROG1 = new Subject(1,Label.PROG1,8,James);
        Subject WEB1 = new Subject(2,Label.WEB1,6,Danielle);
        History history1 = new History(13.00, Instant.now()
                ,"Pénalité aprés avoir non fini un devoir ");
        History history2 = new History(15.00,Instant.now()
                ,"bonus pour bonne conduite");
        Exams firstExamPROG1 = new Exams(1,"Premier Examen PROG1",
                PROG1,Instant.parse("2025-10-30T08:00:00Z"),3);
        Exams testProg1 = new Exams(2,"Test prog1", PROG1
                ,Instant.parse("2025-10-30T08:00:00Z"),3);
        Exams finalExamProg1 = new Exams(3,"Examen final PROG1", PROG1
                ,Instant.parse("2025-10-30T08:00:00Z"),3);
        Exams firstExamWeb1 = new Exams(4, "Premier examen WEB1", WEB1
                ,Instant.parse("2025-10-30T08:00:00Z"), 2);
        Note firstExamNotePROG1 = new Note(16.00, PROG1, Emily,finalExamProg1);
        Note firstTestNoteProg1 = new Note(14.00, PROG1, Jean, testProg1);
        Note firstExamNoteWeb1 = new Note(17.00, WEB1, Emily,firstExamWeb1);
        Note finalExamNoteProg1 = new Note(13.00, PROG1, Emily,finalExamProg1);
        finalExamNoteProg1.changeNote(history1);
        System.out.println(finalExamNoteProg1.getHistory());
        finalExamNoteProg1.changeNote(history2);
        System.out.println(finalExamNoteProg1.getHistory());
        CalculateNotes progFinalNotes = new CalculateNotes();
        System.out.println(progFinalNotes.finalNoteCalculator(List.of(firstExamNotePROG1,firstTestNoteProg1,finalExamNoteProg1)));

    }
}