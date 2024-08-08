package com.liquibase.learning.service;

import com.liquibase.learning.entity.Student;
import com.liquibase.learning.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student createStudents(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
         studentRepository.deleteById(id);
    }

    public Optional<Student> retriveStudent(Long id) {
        return studentRepository.findById(id);
    }
}
