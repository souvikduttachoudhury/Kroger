package com.lister.Kroger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lister.Kroger.domain.Employee;
import com.lister.Kroger.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@RequestMapping("/save")
	public String show(@ModelAttribute Employee emp,Map<String,Object> model){
		EmployeeService es=new EmployeeService();
		es.addemployee(emp);
		List<Employee> le=es.getEmployeeList();
		model.put("Employees", le);
		return "employeedtls";
	}
}
