import org.example.*;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;

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
    History history1;
    History history2;
    History history3;
    History history4;
    History history5;


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
                ,"11 14 05 78 20","mére de l'etudiant");

        tutor2 = new Tutor(1, "Francois","Gabriel"
                ,LocalDate.of(1985,6,12), "GabrielFrancois@gmail.com"
                ,"33 77 78 89 67","Pere de l'étudiant");



    }
}
