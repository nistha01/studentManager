package com.nitish.studentmanagementsystem.service;

import com.nitish.studentmanagementsystem.model.Course;
import com.nitish.studentmanagementsystem.repo.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    ICourseRepo iCourseRepo;


    public void addCourse(Course course){
        iCourseRepo.save(course);
    }
}
