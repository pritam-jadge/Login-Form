package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.bean.Employee;
import com.project.dao.EmployeeDao;

@Controller
public class EmployeeController 
{
	@Autowired
	EmployeeDao dao;
	
	@RequestMapping (value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@RequestParam("userName") String userName, @RequestParam("password") String password)
	{	
		Employee employee = new Employee();
		employee.setUserName(userName);
		employee.setPassword(password);
		
		dao.save(employee);
		
		return new ModelAndView("Success");
	}

	@RequestMapping (value = "/display")
	public ModelAndView display(ModelAndView mv)
	{
		List<Employee> listEmployee = dao.empList();
		mv.addObject("listEmployee", listEmployee);
		mv.setViewName("Display");

		return mv;
	}
}
