/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projectschool.resultprocessing.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author DELL
 */
@Entity
@Table(name="student")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student  implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="STUDENT_ID")
    private Integer sid;
    
    @Column(name="STUDENT_NAME")
    @Size(min=1,max=40)
    
    private String sname;
    
    @Column(name="STUDENT_ADDRESS_1")
    @Size(min=1,max=40)
    private String address1;
   
    @Column(name="STUDENT_ADDRESS_2")
    @Size(min=1,max=40)
    @Null
    private String address2;
    
    @Column(name="STUDENT_PHONE")
    private long phone;
    
    @Column(name="DATE_ADDED")
   private Date date;
    
    
    
}
