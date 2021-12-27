package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    private final StudentService studentService;

    public StudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
