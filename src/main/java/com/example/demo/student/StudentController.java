package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="/api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(1L,
                        "Asım",
                        "asim@asimkilic.com",
                        LocalDate.of(2001, Month.JANUARY,1),
                        20)
        );
    }
}
