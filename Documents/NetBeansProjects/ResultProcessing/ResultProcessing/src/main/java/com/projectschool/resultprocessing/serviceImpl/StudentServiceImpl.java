/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectschool.resultprocessing.serviceImpl;

import com.projectschool.resultprocessing.dao.StudentDao;
import org.projectschool.resultprocessing.model.Student;
import org.projectschool.resultprocessing.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DELL
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
 @Autowired
      StudentDao studentDao;//searchwhy autowired is used with interface rather than class
   
 @Override
    public void insert(Student student) {
     studentDao.save(student);
    }
    
}
