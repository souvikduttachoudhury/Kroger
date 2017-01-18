package com.lister.Project.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lister.Project.domain.Employee;
import com.lister.Project.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@RequestMapping("/save")
	public String show(@ModelAttribute Employee emp,Map<String,Object> model){
		EmployeeService es=new EmployeeService();
		es.addemployee(emp);
		List<Employee> le=es.getEmployeeList(emp.getName());
		model.put("Employees", le);
		return "employeedtls";
	}
}
