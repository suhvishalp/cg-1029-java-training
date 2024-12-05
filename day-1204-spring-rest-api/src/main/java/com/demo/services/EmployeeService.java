package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.exceptions.EmployeeNotFoundException;
import com.demo.models.Employee;
import com.demo.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;

	public EmployeeService() {
		super();
	}

	public EmployeeService(EmployeeRepository empRepository) {
		super();
		this.empRepository = empRepository;
	}

	public Employee saveEmployee(Employee employee) {
		return empRepository.save(employee);
	}

	public Employee findEmployeeById(int id) {
	   return empRepository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee with the ID " + id + " not found"));
	}

	// fetch all the employees i.e. return List<Employee>
	public List<Employee> findAllEmployees() {
		return empRepository.findAll();
	}

	// update the employee
	public Employee updateEmployee(int id, Employee employee) {
		Employee emp = findEmployeeById(id);

		if (emp != null) {
			emp.setCity(employee.getCity());
			emp.setEmpName(employee.getEmpName());
			emp.setSalary(employee.getSalary());
			
			empRepository.save(emp);
		}
		return emp;
	}

	// delete an employee
}
