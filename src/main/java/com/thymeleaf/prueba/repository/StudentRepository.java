package com.thymeleaf.prueba.repository;

import com.thymeleaf.prueba.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
