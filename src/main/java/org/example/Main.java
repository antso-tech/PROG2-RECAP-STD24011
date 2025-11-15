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
                ,LocalDate.of(2005,6,15),
                "emilyBryar.hei.4@gmail.com","24 79 89 90 70"
                ,"F1",Elisa);
        Student Jean = new Student(2, "Francois","Jean"
                , LocalDate.of(2004,9,18),"JeanFrancois14@gmail.com"
                ,"14 69 17 05 89","F3",Gabriel
        );

        Note JeanNote1 = new Note(13.00,Jean);
        Note jeanNote2 = new Note(16.00,Jean);
        Note jeanNote3 = new Note(14.00,Jean);
        Note emilyNote1 = new Note(17.00,Emily);
        Note emilyNote2 = new Note(12.00,Emily);
        Note emilyNote3 = new Note(10.00,Emily);
        Note jeanNote4 = new Note(12.12,Jean);

        Exams firstExamPROG1 = new Exams(1,"Premier Examen PROG1",
                Instant.parse("2025-05-30T08:00:00Z"),3,List.of(jeanNote2,emilyNote2));
        Exams testProg1 = new Exams(2,"Test prog1"
                ,Instant.parse("2025-07-10T08:00:00Z"),2,List.of(JeanNote1,emilyNote1));
        Exams finalExamProg1 = new Exams(3,"Examen final PROG1"
                ,Instant.parse("2025-08-09T08:00:00Z"),2,List.of(jeanNote3,emilyNote3));
        Exams firstExamWeb1 = new Exams(4, "Premier examen WEB1"
                ,Instant.parse("2025-05-27T08:00:00Z"), 2,List.of(jeanNote4));
        Exams ExamTheorie1P1 = new Exams(5,"Examen de théorie 1 partie 1",Instant.parse("2025-11-12T10:00:00Z"),2,List.of(jeanNote2,emilyNote1));
        Exams finalExamWeb1 = new Exams(5,"Examen final WEB1",Instant.parse("2025-11-14T02:45:19Z"),3,List.of(emilyNote3,jeanNote4));


        Subject PROG1 = new Subject(1,Label.PROG1,8,James,List.of(firstExamPROG1,finalExamProg1,testProg1));
        Subject WEB1 = new Subject(2,Label.WEB1,6,Danielle,List.of(firstExamWeb1,finalExamWeb1));
        Subject THEORIE1 = new Subject(3,Label.THEORIE1,3,James,List.of(ExamTheorie1P1));

        History history1 = new History(13.00, Instant.parse("2025-11-14T02:45:19Z")
                ,"Pénalité aprés avoir non fini un devoir ");
        History history2 = new History(15.00,Instant.parse("2025-11-15T17:40:19Z")
                ,"bonus pour bonne conduite");

        jeanNote2.changeNote(history1);
        System.out.println(jeanNote2.getHistory());
        jeanNote2.changeNote(history2);
        System.out.println(jeanNote2.getHistory());
        CalculatorFinalNote progFinalNotes = new CalculatorFinalNote();
        System.out.println(PROG1.finalNoteCalculator(Jean));



    }
}