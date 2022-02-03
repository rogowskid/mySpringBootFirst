package pl.rogowski.springfirst.StudentTestAll;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.rogowski.springfirst.Student.Student;
import pl.rogowski.springfirst.Student.StudentBook;
import static org.junit.Assert.assertNotNull;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StudentBookTest {

    @Autowired
    StudentBook studentBook;
    @Test
    public void validCreateStudent()
    {
        Student student = new Student("Daniel", "Kowalski", "3ID13", 4231);

        assertNotNull(student);
    }

    @Test
    public void validAddStudent()
    {

        studentBook.addStudent();

        assertNotNull(studentBook.getStudentBooks());

    }

}
