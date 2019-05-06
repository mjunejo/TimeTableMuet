package com.muet.timetable.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.muet.timetable.DAOImpl.FacultyDAOImpl;

@Controller
public class FacultyController {
	
	
	 @Autowired
	 FacultyDAOImpl facultydaoimpl;
	 
	 
	 @RequestMapping("/welcome")
		public ModelAndView welcome() {
			ModelAndView model=new ModelAndView("test");
			return model;
		}
	

}
