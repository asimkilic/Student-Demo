package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

            Student asim = new Student(
                    "Asım",
                    "asim@asimkilic.com",
                    LocalDate.of(2001, Month.JANUARY, 1)
                    );
            Student abdullah = new Student(
                    "Abdullah",
                    "abdullah@abdullah.com",
                    LocalDate.of(2004, Month.JANUARY, 1)
                    );
            repository.saveAll(List.of(asim, abdullah));
        };
    }
}
