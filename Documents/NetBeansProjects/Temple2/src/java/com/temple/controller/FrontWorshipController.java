
package com.temple.controller;

import com.temple.dao.WorshipDao;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 @WebServlet({"/index1","/worship/view/"})
public class FrontWorshipController extends HttpServlet {


   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String contextpath = request.getContextPath();
        if (request.getRequestURI().equals(contextpath + "/index1")) {
            request.setAttribute("worshipdata", WorshipDao.select());
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
        } else if (request.getRequestURI().equals(contextpath + "/worship/view/")) {
            int id = Integer.parseInt(request.getParameter("id"));
            
            request.setAttribute("worshipdata", WorshipDao.selectById(id));
            RequestDispatcher rd = request.getRequestDispatcher("/worshipview.jsp");
            rd.forward(request, response);

        }
        
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }


}
