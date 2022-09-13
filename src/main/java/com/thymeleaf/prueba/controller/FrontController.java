package com.thymeleaf.prueba.controller;

import com.thymeleaf.prueba.entities.Student;
import com.thymeleaf.prueba.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class FrontController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public String students(Model model){
        List<Student> students = this.studentService.getAllStudents();
        model.addAttribute("students", students);
        return "students";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@ModelAttribute Student student, Model model){
        System.out.println(student);
        model.addAttribute("student", new Student());
        return "add-student";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute Student student, Model model){
        System.out.println(student);
        this.studentService.createUser(student);
        return "redirect:/students";
    }
}
