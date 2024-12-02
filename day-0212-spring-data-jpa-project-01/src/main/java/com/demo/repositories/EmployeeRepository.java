package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	// save(Employee emp)
	// findById(int id)
	// deleteById(int id)
	// delete(Employee emp)
	// findAll()
	
}

