
package com.temple.controller;

import com.temple.dao.CarouselDao;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/index2","/carousel/view/"})
public class FrontCarouselController extends HttpServlet {

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String contextpath = request.getContextPath();
        if (request.getRequestURI().equals(contextpath + "/index2")) {
            request.setAttribute("carouseldata", CarouselDao.select());
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
        } else if (request.getRequestURI().equals(contextpath + "/carousel/view/")) {
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("carouseldata", CarouselDao.selectById(id));
            RequestDispatcher rd = request.getRequestDispatcher("/carouselview.jsp");
            rd.forward(request, response);

        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    

}
