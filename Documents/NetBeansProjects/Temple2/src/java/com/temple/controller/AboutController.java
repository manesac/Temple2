/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.controller;

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
@WebServlet({"/index3","/introduction","/mission","/vision"})
public class AboutController extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String contextpath=request.getContextPath();
        if(request.getRequestURI().equals(contextpath+"/index3"))
        {
        RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
        rd.forward(request,response);
        }
        else if(request.getRequestURI().equals(contextpath+"/introduction"))
        {
        RequestDispatcher rd=request.getRequestDispatcher("/introduction.jsp");
        rd.forward(request,response);
        }
        else if(request.getRequestURI().equals(contextpath+"/mission"))
        {
        RequestDispatcher rd=request.getRequestDispatcher("/mission.jsp");
        rd.forward(request,response);
        }
        
        else if(request.getRequestURI().equals(contextpath+"/vision"))
        {
        RequestDispatcher rd=request.getRequestDispatcher("/vision.jsp");
        rd.forward(request,response);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


}
