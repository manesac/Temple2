/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectschool.resultprocessing.daoImpl;

import com.projectschool.resultprocessing.dao.StudentDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.projectschool.resultprocessing.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DELL
 */
@Repository
public class StudentDaoImpl implements StudentDao {
@Autowired
SessionFactory sessionFactory;
    @Override
    public void save(Student student) {
//      firstway to insert data to database 
Session session=sessionFactory.openSession();
session.save(student);
session.beginTransaction().commit();
session.close();
//sesond way
//sessionFactory.openSession().save(student);
    }

   
    
}
