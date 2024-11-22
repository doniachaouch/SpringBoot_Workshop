package edu.polytech.springbootdemo.student;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private StudentService service = new StudentService();

    @GetMapping
    public List<StudentModel> findAllStudents() {
        return service.findAllStudents();
    }

}
