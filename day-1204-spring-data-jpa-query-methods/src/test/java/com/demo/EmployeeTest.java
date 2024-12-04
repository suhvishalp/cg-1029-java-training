package com.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.model.Employee;
import com.demo.repositories.EmployeeRepository;

@SpringBootTest
public class EmployeeTest {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	
	@Test
	public void textFetchEmployeeByCity() {
	  
//		List<Employee> list = employeeRepository.fetchAllEmployeesByCity("Chicago");
		
//		list.forEach(System.out::println);
	
	}
}
