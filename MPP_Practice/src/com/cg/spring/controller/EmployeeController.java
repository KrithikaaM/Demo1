package com.cg.spring.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.dto.Employee;
import com.cg.spring.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/showall",method=RequestMethod.GET)
	public ModelAndView getAllEmployees() //modelandview : 
	{
		List<Employee> list = employeeService.showEmployees();
		return new ModelAndView("show","emps",list); //show.jsp since suffix is jsp in xml
		//return list in show.jsp using emps object --> list assigned to emps
		//view:show.jsp
	}
	
	
	@RequestMapping(value="/addemployee",method=RequestMethod.POST)
	public String addEmployee( @Valid @ModelAttribute("emp")Employee emp,BindingResult result,Map<String,Object> model)
	{//modelattr : binds data to object second emp
		
		if(result.hasErrors()) {
		return "add_employee";
		
		}
		 employeeService.addEmployee(emp);
		 return "redirect:/showall";
	}
	
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String myEmployee(@ModelAttribute("emp") Employee emp,Map<String,Object> model) {
		model.put("emp", emp);
		
		
		return "add_employee";
	}
	
	
}
