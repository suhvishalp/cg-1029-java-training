package com.demo.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.exceptions.EmployeeNotFoundException;
import com.demo.models.Employee;
import com.demo.services.EmployeeService;

import jakarta.validation.Valid;

@RestController()
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	public EmployeeController() {
		super();
	}

	@GetMapping()
	public ResponseEntity<List<Employee>> findALLEmployees() {
		
		List<Employee> employeeList = employeeService.findAllEmployees();
		
		return new ResponseEntity<List<Employee>>(employeeList, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> findEmployee(@PathVariable("id") int empId) {
		
		Employee emp = employeeService.findEmployeeById(empId);
		
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
		
	}
	
	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee) {
		
		Employee emp = employeeService.saveEmployee(employee);
		
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
		
	}

	@PutMapping("/{id}")
	public  ResponseEntity<Employee> updateEmployee(@PathVariable int id, @Valid @RequestBody Employee employee) {
		
		Employee emp = employeeService.updateEmployee(id, employee);
		
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}
	
	
	
}
