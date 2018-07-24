package com.cg.spring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.spring.dto.Employee;

@Repository("employeedao") //making this dao class as repository where all data are stored
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired 
	//to import from xml since its bean is there (to inject bean)
	@PersistenceContext //to persist to database table (to make db specific operation)
	EntityManager entityManager; 
	//for connecting to JPA
	//has an API to add and retrieve obj from table: persist-add, query.
	//1.create bean 2.give db usname and password and give url
	
	@Override
	public void addEmployee(Employee e) {
		entityManager.persist(e); //saves to the database
		
	}

	@Override
	public List<Employee> showEmployees() {
		//query returns resultsetlist so we use list here
		List<Employee> list = new ArrayList<Employee>();
		Query q = entityManager.createQuery("from Employee");//similar to select * from emp;
		list = q.getResultList();
		return list;
	}

}
