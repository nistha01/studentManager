package com.nitish.studentmanagementsystem.service;

import com.nitish.studentmanagementsystem.model.Teacher;
import com.nitish.studentmanagementsystem.repo.ITeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Autowired
    ITeacherRepo iTeacherRepo;
    public void addTeacher(Teacher teacher){
        iTeacherRepo.save(teacher);
    }

}
