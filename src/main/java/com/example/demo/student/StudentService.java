package com.example.demo.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Component
public class StudentService {

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
