package com.temple.controller;

import com.temple.dao.EventDao;
import com.temple.dao.WorshipDao;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/index", "/event/view/"})
public class FrontController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextpath = request.getContextPath();
        if (request.getRequestURI().equals(contextpath + "/index")) {
            request.setAttribute("eventdata", EventDao.select());
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
        } else if (request.getRequestURI().equals(contextpath + "/event/view/")) {
            int id = Integer.parseInt(request.getParameter("id"));
            
            request.setAttribute("eventdata", EventDao.selectById(id));
            RequestDispatcher rd = request.getRequestDispatcher("/eventview.jsp");
            rd.forward(request, response);

        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
