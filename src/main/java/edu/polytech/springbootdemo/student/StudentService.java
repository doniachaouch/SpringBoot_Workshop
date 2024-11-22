package edu.polytech.springbootdemo.student;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<StudentModel> findAllStudents() {
    return List.of(
            new StudentModel(
                    "Donia",
                            "Chaouch",
                    LocalDate.now(),
                    "dchaouch01@gmail.com",
                            29

                            ),
                            new StudentModel(
                "Zayn",
                        "Slimene",
                LocalDate.now(),
                "dchaouch01@gmail.com",
                        1
                        )
                        );
}
}
