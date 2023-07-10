package com.nitish.studentmanagementsystem.repo;

import com.nitish.studentmanagementsystem.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends CrudRepository<Student,Long> {
}
