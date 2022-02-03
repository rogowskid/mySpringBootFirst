package pl.rogowski.springfirst.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;
import pl.rogowski.springfirst.Student.Student;

import java.util.LinkedList;

@AllArgsConstructor
@Data
@Repository
public class StudentBook {


    private LinkedList<Student> studentBooks = new LinkedList<Student>();
    private Student student;


    public StudentBook() {
        student = new Student();
    }

    public void addStudent()
    {
        studentBooks.add(student.createStudent());
    }

    public LinkedList<Student> getStudentBooks() {
        return studentBooks;
    }


}
