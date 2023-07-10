package com.nitish.studentmanagementsystem.service;

import com.nitish.studentmanagementsystem.model.Subject;
import com.nitish.studentmanagementsystem.repo.ISubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {
    @Autowired
    ISubjectRepo iSubjectRepo;
    public void addSubject(Subject subject){
        iSubjectRepo.save(subject);
    }
}
