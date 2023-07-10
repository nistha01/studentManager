package com.nitish.studentmanagementsystem.repo;

import com.nitish.studentmanagementsystem.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends CrudRepository<Course,Long> {
}
