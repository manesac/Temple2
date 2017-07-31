/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projectschool.resultprocessing.controller;

import java.util.Date;
import org.projectschool.resultprocessing.model.Student;
import org.projectschool.resultprocessing.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller//this denote that below java class is a controller
public class IndexController {
     @Autowired
     StudentService studentservice;
     @RequestMapping(value={"/index","/"}, method=RequestMethod.GET)
     public String index(){
         return "index";
     }
     
     @RequestMapping(value="/personal-info", method=RequestMethod.GET)
     public String pi(){
         return "personal-info";
     }
     
//     @RequestMapping(value="/personal-info", method=RequestMethod.GET)
//     public ModelAndView a(){
//         ModelAndView mv= new ModelAndView("personal-info");
//         return mv;
//     }
     @RequestMapping(value="/student",method=RequestMethod.GET)
     public String Student()
     {
     return "student";
     }
     @RequestMapping(value="/savestudent",method=RequestMethod.POST)
     public String save(@RequestParam("sname") String name,
             @RequestParam("address1") String address1,
             @RequestParam("address2") String address2,
                     @RequestParam("phone") long phone,
             @RequestParam("date")Date date){
     
     Student s=new Student();
     s.setSname(name);
     s.setAddress1(address1);
     s.setAddress2(address2);
     s.setPhone(phone);
     s.setDate(date);
        studentservice.insert(s);
        return "student";
     
     
     }

  
    
}
