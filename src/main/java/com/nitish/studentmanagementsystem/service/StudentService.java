package com.nitish.studentmanagementsystem.service;

import com.nitish.studentmanagementsystem.model.Student;
import com.nitish.studentmanagementsystem.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    IStudentRepo istudentRepo;

    public void addStudent(Student student){
        istudentRepo.save(student);
    }
}
