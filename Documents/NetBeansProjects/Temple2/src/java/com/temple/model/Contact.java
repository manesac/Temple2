/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.model;

/**
 *
 * @author DELL
 */
public class Contact {
    private int cid;
    private String name;
   private String mail;
    private int telnumber;
    private String comment;
    
    
    public Contact() {
    }

    public Contact(int cid, String name, String mail, int telnumber, String comment) {
        this.cid = cid;
        this.name = name;
        this.mail = mail;
        this.telnumber = telnumber;
        this.comment = comment;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(int telnumber) {
        this.telnumber = telnumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
    
}
