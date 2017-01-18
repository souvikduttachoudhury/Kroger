package com.lister.Kroger.controller;


import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lister.Kroger.domain.Employee;

@Controller
public class HomeController {
	DataSource dataSource;
	
	@RequestMapping(value="/")
	public String Hello(Model model){
		Employee emp=new Employee();
		
		model.addAttribute("Employee",emp);
		return "welcome";
	}
}
