package com.irmaktekin.spring_boot_app.dao;

import com.irmaktekin.spring_boot_app.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDaoImp implements StudentDao{

    private final EntityManager entityManager;

    @Autowired
    public StudentDaoImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //save student to the database
    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }
}
