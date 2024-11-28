package com.demo.services;

import com.demo.dao.EmployeeDAO;

public class EmployeeService {
	
	private EmployeeDAO employeeDAO;
	
	public EmployeeService() {
		System.out.println("EmployeeService object is created");
	}

	public EmployeeService(EmployeeDAO employeeDAO, int count, String url) {
		super();
		this.employeeDAO = employeeDAO;
		System.out.println("EmploeyeeSerivce object is created and initialized");
	}

	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	
	 

}
