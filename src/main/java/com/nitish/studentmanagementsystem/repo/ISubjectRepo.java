package com.nitish.studentmanagementsystem.repo;

import com.nitish.studentmanagementsystem.model.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubjectRepo extends CrudRepository<Subject,Long> {
}
