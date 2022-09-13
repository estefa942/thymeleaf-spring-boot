package com.thymeleaf.prueba.controller;
import com.thymeleaf.prueba.entities.Student;
import com.thymeleaf.prueba.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    /*@GetMapping
    public List<Student> getUsers(){
        return studentService.getAllStudents();
    }*/

    /*@PostMapping
    public Student createUser(@RequestBody Student student){
        return studentService.createUser(student);
    }*/

}
