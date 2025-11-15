package org.example;

import java.time.Instant;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




*

        Exam firstExamPROG1 = new Exam(1,"Premier Examen PROG1",
                Instant.parse("2025-05-30T08:00:00Z"),3,List.of(jeanNote2,emilyNote2));
        Exam testProg1 = new Exam(2,"Test prog1"
                ,Instant.parse("2025-07-10T08:00:00Z"),2,List.of(JeanNote1,emilyNote1));
        Exam finalExamProg1 = new Exam(3,"Examen final PROG1"
                ,Instant.parse("2025-08-09T08:00:00Z"),2,List.of(jeanNote3,emilyNote3));
        Exam firstExamWeb1 =
        Exam ExamTheorie1P1 = new Exam(5,"Examen de théorie 1 partie 1",Instant.parse("2025-11-12T10:00:00Z"),2,List.of(jeanNote2,emilyNote1));
        Exam finalExamWeb1 = new Exam(5,"Examen final WEB1",Instant.parse("2025-11-14T02:45:19Z"),3,List.of(emilyNote3,jeanNote4));


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
        System.out.println(PROG1.finalNoteCalculator(Jean));
        System.out.println(finalExamProg1.getExamGrade(Jean,Instant.parse("2025-11-15T17:40:19Z")));

    }
}