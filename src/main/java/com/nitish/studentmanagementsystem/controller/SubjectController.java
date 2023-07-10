package com.nitish.studentmanagementsystem.controller;

import com.nitish.studentmanagementsystem.model.Subject;
import com.nitish.studentmanagementsystem.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {
    @Autowired
    SubjectService subjectService;
    @PostMapping("subject")
    public void addSubject(@RequestBody Subject subject){
        subjectService.addSubject(subject);
    }
}
