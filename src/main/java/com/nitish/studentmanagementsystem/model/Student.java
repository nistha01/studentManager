package com.nitish.studentmanagementsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentName;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_address_Id")
    private Address address;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_subject_Id")
    private Subject subject;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_student_Id")
    private List<Teacher> teachers;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "fk_student_course_table",joinColumns = @JoinColumn(name = "fk_student_id"),
            inverseJoinColumns = @JoinColumn(name = "fk_course_id"))
    private List<Course> courses ;



}
