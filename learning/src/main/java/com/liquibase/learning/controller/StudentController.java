package com.liquibase.learning.controller;


import com.liquibase.learning.entity.Student;
import com.liquibase.learning.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudents(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id){
         studentService.deleteStudent(id);
    }

    @GetMapping("/retrive-students/{id}")
    public Optional<Student> retriveStudent(@PathVariable Long id){
        return studentService.retriveStudent(id);
    }


}
