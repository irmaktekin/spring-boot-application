package com.irmaktekin.spring_boot_app.dao;

import com.irmaktekin.spring_boot_app.entity.Student;

import java.util.List;


public interface StudentDao {
    void save(Student student);
    Student findById(Integer id);
    List<Student> findAll();
    List<Student> findByLastName(String lastName);

}
