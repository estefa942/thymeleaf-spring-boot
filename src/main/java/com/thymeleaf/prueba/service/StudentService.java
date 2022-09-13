package com.thymeleaf.prueba.service;

import com.thymeleaf.prueba.entities.Student;
import com.thymeleaf.prueba.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return (List<Student>) this.studentRepository.findAll();
    }

    public Student createUser(Student student) {
        return this.studentRepository.save(student);
    }
}
