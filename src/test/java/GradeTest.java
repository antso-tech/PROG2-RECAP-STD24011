import org.example.*;
import org.junit.jupiter.api.BeforeEach;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

public class GradeTest {
    Teacher teacher1;
    Teacher teacher2;
    Tutor tutor1;
    Tutor tutor2;
    Student student1;
    Student student2;
    Note note1;
    Note note2;
    Note note3;
    Note note4;
    Note note5;
    Exam exam1;
    Exam exam2;
    Exam exam3;
    Exam exam4;
    Subject subject1;
    Subject subject2;
    History history1;
    History history2;
    History history3;
    History history4;


    @BeforeEach
    void addAttributs(){
        teacher1 = new Teacher(1,"Frances","James"
                , LocalDate.of(1990,11,6),"james@gmail.com"
                ,"01 23 45 67 89","FullStack");

        teacher2 = new Teacher(2,"John","Danielle"
                ,LocalDate.of(1996,5,8),"DanielleJohn@gmail.com"
                ,"34 67 18 10 60","Front End");

        tutor1 = new Tutor(1,"Bryar","Elisa"
                ,LocalDate.of(1980,12,8),"ElisaBryar04@gmail.com"
                ,"11 14 05 78 20","mére de l'etudiant"
        );

        tutor2 = new Tutor(1, "Francois","Gabriel"
                ,LocalDate.of(1985,6,12), "GabrielFrancois@gmail.com"
                ,"33 77 78 89 67","Pere de l'étudiant"
        );

        student1 = new Student(1, "Bryar","Emily"
                ,LocalDate.of(2005,6,15),
                "emilyBryar.hei.4@gmail.com","24 79 89 90 70"
                ,"F1",tutor1
        );

        student2 = new Student(2, "Francois","Jean"
                , LocalDate.of(2004,9,18),"JeanFrancois14@gmail.com"
                ,"14 69 17 05 89","F3",tutor2
        );

        note1 = new Note(13.50,student1);
        note2 =  new Note(16.00,student1);
        note3 =  new Note(14.50,student1);
        note4 =  new Note(17.00,student2);
        note5 =  new Note(12.25,student2);

        exam1 = new Exam(1,"Premier Examen PROG1",
                Instant.parse("2025-05-30T08:00:00Z"),3,List.of(note1,note4));
        exam2 =  new Exam(3,"Examen final PROG1"
                ,Instant.parse("2025-08-09T08:00:00Z"),2,List.of(note3,note5));
        exam3 = new Exam(2,"Test prog1"
                ,Instant.parse("2025-07-10T08:00:00Z"),2,List.of(note2));
        exam4 = new Exam(4, "Premier examen WEB1"
                ,Instant.parse("2025-05-27T08:00:00Z"), 2,List.of(note1,note5));

        subject1 = new Subject(1,Label.PROG1,8,teacher1,List.of(exam1,exam2,exam3));
        subject2 = new Subject(2,Label.WEB1,6,teacher2,List.of(exam4));

        history1 =  new History(13.00, Instant.parse("2025-11-15T07:45:19Z")
                ,"devoir mal fini");
        history2 = new History(15.00,Instant.parse("2025-11-15T17:40:19Z")
                ,"bonus pour bonne conduite");
        history3 = new History(14.00, Instant.parse("2025-11-16T15:15:20Z"),"réussite à un test");
        history4 = new History(11.00, Instant.parse("2025-11-16T13:10:11Z"),"punition collectif due au bavardage");





    }
}
