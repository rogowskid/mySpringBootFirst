package pl.rogowski.springfirst.Student;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rogowski.springfirst.Calc.Calc;

@RestController
@Component

public class HelloStudent {

    StudentBook studentBook;
    public HelloStudent(Calc calc, StudentBook studentBook) {
        this.studentBook = studentBook;
    }

    @GetMapping("/studentExample")

        public String index()
            {

                studentBook.addStudent();
                return studentBook.getStudentBooks().toString();
            }


}
