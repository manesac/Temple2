/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.dao;

import com.temple.model.Event;
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
public class EventDao {
    
    public static void insert(Event event) {
        try {
           Class.forName("org.postgresql.Driver");
           // Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
        }
        Connection con = null;
        Statement st = null;
        try {
           con = DriverManager.getConnection("jdbc:postgresql://localhost:5431/temple", "postgres", "postgres");
         //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/temple","root","");
        } catch (Exception e) {
        }
        String sql = "insert into event(event_name,event_time,hall_name,event_organizer,event_description) values('" + event.getEventName() + "','"
                + event.getEventTime() + "','" + event.getHallName() + "','" +event.getEventOrganizer() + "','"+event.getEventDescription() +"')";

        try {
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
     public static List<Event> select() {
        ArrayList al = new ArrayList();
        try {
            Class.forName("org.postgresql.Driver");
           //  Class.forName("com.mysql.jdbc.Driver");
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
        String sql = "select *from event";
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                al.add(new Event(rs.getInt("eid"), rs.getString("event_name"), rs.getString("event_time"), rs.getString("hall_name"),rs.getString("event_organizer"), rs.getString("event_description")));
            }
        } catch (Exception e) {
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
           // con=DriverManager.getConnection("jdbc:mysql://localhost:3306/temple","root","");
        } catch (Exception e) {
            System.out.println(e);
        }
        String sql = "delete from event where eid=" + id;
        try {
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e);
                    
                    }
        }
        
        

        public static List<Event> selectById(int id) {
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
        String sql = "select * from event where eid=" + id;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                al.add(new Event(rs.getInt("eid"), rs.getString("event_name"), rs.getString("event_time"), rs.getString("hall_name")
                     ,rs.getString("event_organizer"),rs.getString("event_description")));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;

    }
        

        public static void update(Event ev) {
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
         String sql="update event set event_name='"+ev.getEventName()+"',event_time='"+ev.getEventTime()+
               "',hall_name='"+ev.getHallName()+"',event_organizer='"+ev.getEventOrganizer()+"',event_description='"+ev.getEventDescription()+
                "' where eid="+ev.getEid();
       
        try {
            st=con.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
        
        
    
    




     
