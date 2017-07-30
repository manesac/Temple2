/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.dao;

import com.temple.model.Contact;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class ContactDao {
    public  static void insert(Contact contact)
    {
        try {
            Class.forName("org.postgresql.Driver");

        } catch (Exception e) {
        }
        Connection con = null;
        Statement st = null;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5431/temple", "postgres", "postgres");

        } catch (Exception e) {
        }
        String sql = "insert into contact(cname,,mail,phone,message) values('" + contact.getName() + "','"
                + contact.getMail() + "','" + contact.getTelnumber() + "','" + contact.getComment()+ "')";
       
        try {
            st = con.createStatement();
            st.execute(sql);
             
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
    
    
    
    }
    
