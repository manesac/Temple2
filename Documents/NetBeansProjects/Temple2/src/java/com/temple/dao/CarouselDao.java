/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.dao;

import com.temple.model.Carousel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class CarouselDao {
    public static void insert(Carousel c){
        try {
           Class.forName("org.postgresql.Driver");
           //Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
        }
        Connection con = null;
        Statement st = null;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5431/temple", "postgres", "postgres");
            //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/temple","root","");
        } catch (Exception e) {
        }
        String sql="insert into carousel(file,status) values('"+c.getFile()+"','"+c.getStatus()+"')";
        try {
            st=con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
        }
    }
    
    ////////////for select///////////////////
    
  public static List<Carousel>select() 
  {
  
   ArrayList al = new ArrayList();
        try {
          Class.forName("org.postgresql.Driver");
          // Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }

        Connection con = null;
        Statement st = null;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5431/temple", "postgres", "postgres");
       //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/temple","root","");

        } catch (Exception e) {
            System.out.println(e);
        }
  String sql="select * from carousel";
      try {
          st=con.createStatement();
          ResultSet rs=st.executeQuery(sql);
          
          while(rs.next())
          {
          al.add(new Carousel(rs.getInt("id"),rs.getString("file"),rs.getString("status")));
          
          }
      } catch (Exception e) {
          System.out.println(e);
      }
      return al;
  }
  
  
  public static void delete(int id) {
        try {
            Class.forName("org.postgresql.Driver");
           // Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }
        Connection con = null;
        Statement st = null;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5431/temple", "postgres", "postgres");
            //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/temple","root","");
        } catch (Exception e) {
            System.out.println(e);
        }
        String sql = "delete from carousel where id=" + id;
        try {
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e);
                    
                    }
        }
        
        
        public static List<Carousel> selectById(int id) {
        ArrayList al = new ArrayList();
        try {
            Class.forName("org.postgresql.Driver");
            //Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }

        Connection con = null;
        Statement st = null;
        try {
con = DriverManager.getConnection("jdbc:postgresql://localhost:5431/temple", "postgres", "postgres");
 //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/temple","root","");
        } catch (Exception e) {
            System.out.println(e);
        }
        String sql = "select * from carousel where id=" + id;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                al.add(new Carousel(rs.getInt("id"), rs.getString("file"), rs.getString("status")));
                       
            }
        } catch (Exception e) {
        }
        return al;

    }
        public static void update(Carousel c) {
        try {
            Class.forName("org.postgresql.Driver");
            //Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }

        Connection con = null;
        Statement st = null;
        try {
           con = DriverManager.getConnection("jdbc:postgresql://localhost:5431/temple", "postgres", "postgres");
           //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/temple","root","");
        } catch (Exception e) {
            System.out.println(e);
        }
        String sql="update carousel set file='"+c.getFile()+"',status='"+c.getStatus()+"'where id="+c.getId();
                
        try {
            st=con.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
 
        
}
