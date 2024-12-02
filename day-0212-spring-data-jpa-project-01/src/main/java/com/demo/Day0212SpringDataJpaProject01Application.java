package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Pageable;

import com.demo.model.Employee;
import com.demo.repositories.EmployeeRepository;
import com.demo.services.EmployeeService;

@SpringBootApplication
public class Day0212SpringDataJpaProject01Application {
	
	

	public static void main(String[] args) {
	
		ConfigurableApplicationContext context = SpringApplication.run(Day0212SpringDataJpaProject01Application.class, args);
	
		EmployeeRepository empRepo = context.getBean(EmployeeRepository.class);
//		
//		Employee employee = new Employee("Vishal", "Hyderabad", 3400.00);
//		
//		empRepo.save(employee);
		
//		EmployeeService employeeService = context.getBean(EmployeeService.class);
//		employeeService.saveEmployee(employee);
		
//		Pageable page = Pageable.ofSize(20);
//		empRepo.findAll(page);
		
		
		
	}

}
