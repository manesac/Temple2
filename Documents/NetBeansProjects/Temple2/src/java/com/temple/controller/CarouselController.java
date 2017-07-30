/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.controller;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.temple.dao.CarouselDao;
import com.temple.model.Carousel;
import java.io.IOException;
import java.util.List;
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
@WebServlet({"/admin/carousel","/admin/carousel/add","/admin/carousel/edit/","/admin/carousel/delete/"})
public class CarouselController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String contextpath = request.getContextPath();
        if (request.getRequestURI().equals(contextpath + "/admin/carousel")) {
           
            List<Carousel> al=CarouselDao.select();
            request.setAttribute("carouseldata",al);
            
        RequestDispatcher rd = request.getRequestDispatcher("/admin-carousel.jsp");
            rd.forward(request, response);
            
    }
        else if (request.getRequestURI().equals(contextpath + "/admin/carousel/delete/")) {
            int id = Integer.parseInt(request.getParameter("id").trim());
            CarouselDao.delete(id);
            response.sendRedirect(contextpath + "/admin/carousel");

        }
        
        else if (request.getRequestURI().equals(contextpath + "/admin/carousel/edit/")) {
            int id = Integer.parseInt(request.getParameter("id").trim());
            request.setAttribute("carouselvalue", CarouselDao.selectById(id));
            RequestDispatcher rd = request.getRequestDispatcher("/admin-carousel.jsp");
            rd.forward(request, response);
        }
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextpath=request.getContextPath();
        if(request.getRequestURI().equals(contextpath+"/admin/carousel/add")){
            
//            int id=0;
//            try {
//                id=Integer.parseInt(request.getParameter("id"));
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//            
           String storePath=request.getServletContext().getRealPath("images");
           MultipartRequest mr= new MultipartRequest(request,storePath,10000000,new DefaultFileRenamePolicy());
           String fileName=mr.getFilesystemName("image");
           String status=mr.getParameter("status");
           //encapsulating it in the object
           Carousel c= new Carousel();
           c.setFile(fileName);
           c.setStatus(status);
           //sending it to dao to insert it in database
           
          CarouselDao.insert(c);
           
//           
//           if(id==0){
//            //WorshipDao.insert(w);
//            CarouselDao.insert(c);
//            }
//            else{
//                c.setId(id);
//                CarouselDao.update(c);
//           }
            //going back to form
            response.sendRedirect(contextpath + "/admin/carousel");
        }
           
        }
       
    }



