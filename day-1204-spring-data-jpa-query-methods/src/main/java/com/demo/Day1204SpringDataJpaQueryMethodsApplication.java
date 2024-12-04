package com.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.demo.model.Employee;
import com.demo.repositories.EmployeeRepository;

@SpringBootApplication
public class Day1204SpringDataJpaQueryMethodsApplication {

	public static void main(String[] args) {
		
	  ConfigurableApplicationContext context =	SpringApplication.run(Day1204SpringDataJpaQueryMethodsApplication.class, args);
	
	  EmployeeRepository empRepo = context.getBean(EmployeeRepository.class);
	  
	 // List<Employee> list = empRepo.fetchAllEmployeesByCity("Chicago");
	  
//	  List<Employee> list = empRepo.findAllByDepartmentDeptName("HR");
//	  list.forEach(System.out::println);
	  
	  int count = empRepo.countEmployees();
	  System.out.println(count);
	 
	}

}
