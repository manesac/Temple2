/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.dao;

import com.temple.model.Worship;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell PC
 */
public class WorshipDao {

    public static void insert(Worship worship) {
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
            // con=DriverManager.getConnection("jdbc:mysql://localhost:3306/temple","root","");
        } catch (Exception e) {
            System.out.println(e);
        }
        String sql = "insert into worship(worship_name,worship_time,worship_guru) values('" + worship.getPujaName() + "','"
                + worship.getPujaTime() + "','" + worship.getPujaBy() + "')";

        try {
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static List<Worship>select() {
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
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/temple","root","");
        } catch (Exception e) {
            System.out.println(e);
        }
        String sql = "select *from worship";
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                al.add(new Worship(rs.getInt("wid"), rs.getString("worship_name"), rs.getString("worship_guru"), rs.getString("worship_time")));
            }
        } catch (Exception e) {
        }
        return al;

    }

    public static void delete(int id) {
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
// con=DriverManager.getConnection("jdbc:mysql://localhost:3306/temple","root","");
        } catch (Exception e) {
            System.out.println(e);
        }
        String sql = "delete from worship where wid=" + id;
        try {
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e
            );
        }
    }

    public static List<Worship> selectById(int id) {
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
// con=DriverManager.getConnection("jdbc:mysql://localhost:3306/temple","root","");
        } catch (Exception e) {
            System.out.println(e);
        }
        String sql = "select * from worship where wid=" + id;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                al.add(new Worship(rs.getInt("wid"), rs.getString("worship_name"), rs.getString("worship_guru"), rs.getString("worship_time")));
            }
        } catch (Exception e) {
        }
        return al;

    }

    public static void update(Worship w) {
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
        String sql="update worship set worship_name='"+w.getPujaName()+"',worship_time='"+w.getPujaTime()+
                "',worship_guru='"+w.getPujaBy()+"' where wid="+w.getWid();
        try {
            st=con.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

