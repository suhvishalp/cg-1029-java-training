package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.dao.EmployeeDAO;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		EmployeeDAO empDao1 =	context.getBean(EmployeeDAO.class);
		EmployeeDAO empDao2 =	context.getBean(EmployeeDAO.class);

	}

}
