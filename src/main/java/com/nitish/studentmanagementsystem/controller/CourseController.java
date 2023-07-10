package com.nitish.studentmanagementsystem.controller;

import com.nitish.studentmanagementsystem.model.Course;
import com.nitish.studentmanagementsystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;
    @PostMapping("course")
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }
}
