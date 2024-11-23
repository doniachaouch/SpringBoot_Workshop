package edu.polytech.springbootdemo.student;

import java.util.List;


public interface StudentService {

    StudentController save( StudentController studentController);
    List<StudentController> findAllStudents();
    StudentController findByEmail(String email);
    StudentController update(StudentController studentController);
    void delete (String email);
}
