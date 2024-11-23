package edu.polytech.springbootdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class InMemoryStudentService implements StudentService {


    @Override
    public StudentController save(StudentController studentController) {
        return null;
    }

    @Override
    public List<StudentController> findAllStudents(){
        return null;
}

    @Override
    public StudentController findByEmail(String email) {
        return null;
    }

    @Override
    public StudentController update(StudentController studentController) {
        return null;
    }

    @Override
    public void delete(String email) {

    }
}
