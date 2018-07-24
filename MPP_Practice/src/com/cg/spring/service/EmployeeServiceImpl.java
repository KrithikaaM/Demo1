package com.cg.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.dao.EmployeeDao;
import com.cg.spring.dto.Employee;

@Service("employeeservice") 
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired   //to inject from bean instead of using new operator
	EmployeeDao employeeDao; //creating reference thru dao interface
	
	@Override
	public void addEmployee(Employee e) {
		
		employeeDao.addEmployee(e);
	}

	@Override
	public List<Employee> showEmployees() {
	
		return employeeDao.showEmployees();
		
	}

}
