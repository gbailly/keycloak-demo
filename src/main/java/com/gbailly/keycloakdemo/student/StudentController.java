package com.gbailly.keycloakdemo.student;

import com.gbailly.keycloakdemo.student.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    List<Student> getStudents() {
        return List.of(
                new Student("Bart", "Simpson"),
                new Student("Lisa", "Simpson")
        );
    }
}
