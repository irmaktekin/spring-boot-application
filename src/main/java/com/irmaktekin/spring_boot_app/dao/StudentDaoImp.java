package com.irmaktekin.spring_boot_app.dao;

import com.irmaktekin.spring_boot_app.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findAll() {
        //create query
        TypedQuery<Student> query = entityManager.createQuery("FROM Student order by lastName",Student.class);

        /*return query results */
        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> query = entityManager.createQuery("From Student Where lastName=:theData", Student.class);
        query.setParameter("theData",lastName);

        return query.getResultList();
    }
}
