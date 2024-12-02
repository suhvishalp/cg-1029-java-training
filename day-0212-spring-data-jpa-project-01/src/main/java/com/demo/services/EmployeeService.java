package com.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;
import com.demo.repositories.EmployeeRepository;

@Service
public class EmployeeService {

		
	private EmployeeRepository empRepository;

	public EmployeeService() {
		super();
	}

	@Autowired	
	public EmployeeService(EmployeeRepository empRepository) {
		super();
		this.empRepository = empRepository;
	}
	
	public Employee saveEmployee(Employee employee) {
		return empRepository.save(employee);
	}
	
	public Employee findEmployeeById(int id) {
		Optional<Employee> optionalEmployee = empRepository.findById(id);
		
		if(optionalEmployee.isPresent())
			return optionalEmployee.get();
		
		return null;
	}
	
	//fetch all the employees i.e. return List<Employee> 
	
	//update the employee 
	
	//delete an employee
}
