package com.nitish.studentmanagementsystem.controller;

import com.nitish.studentmanagementsystem.model.Student;
import com.nitish.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("student")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
}
