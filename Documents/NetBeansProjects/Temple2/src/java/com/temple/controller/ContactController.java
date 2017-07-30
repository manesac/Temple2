/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.controller;

import com.temple.dao.ContactDao;
import com.temple.model.Contact;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet({"/contact","/contact/add"})
public class ContactController extends HttpServlet {

   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextpath=request.getContextPath();
        if(request.getRequestURI().equals(contextpath+"/contact"))
        {
        RequestDispatcher rd=request.getRequestDispatcher("contact.jsp");
        rd.forward(request,response);
        }
        
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextPath = request.getContextPath();
        if (request.getRequestURI().equals(contextPath + "/contact/add")) {
 String name = request.getParameter("name");
     String email=request.getParameter("mail");
    int telno=request.getParameter("tel-number");
     String message=request.getParameter("comment");
     Contact c=new Contact();
     c.setName(name);
     c.setMail(email);
   c.setTelnumber(telno);
     c.setComment(message);
     ContactDao.insert(c);
    response.sendRedirect(contextPath + "/contact");
    }
    }
    
}
