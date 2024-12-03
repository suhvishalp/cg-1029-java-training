package com.demo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.model.Department;
import com.demo.model.Employee;
import com.demo.repositories.DepartmentRepository;
import com.demo.repositories.EmployeeRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
class Day1203SpringDataJpaRelationshipsApplicationTests {
	
	@Autowired
	private DepartmentRepository deptRepo;
	
	@Autowired
	private EmployeeRepository empRepo;

	@Test
	void contextLoads() {
	}
	
//	@Test
//	public void testCreateDepartment() {
//		//test creating a department and persist it using deptRepo
//		Department department = new Department("Marketing");
//		deptRepo.save(department);
//		
//	}
	
//	@Test
//	public void testCreateEmployee() {
//		
//		Employee employee = new Employee();
//		
//		employee.setEmpName("Vishal");
//		employee.setCity("Pune");
//		employee.setSalary(6500.00);
//		
////		Department department = new Department("Marketing");
////		employee.setDepartment(department);
//		
//		Optional<Department> optionalDepartment = deptRepo.findById(1);
//		
//		
//		if(optionalDepartment.isPresent()) {
//			Department dept = optionalDepartment.get();
//			System.out.println(dept);
//			employee.setDepartment(dept);
//		}
//		
//		empRepo.save(employee);
//	}
	
	@Test
	@Transactional
	public void testUpdateEmployeesDepartment() {
		
		Optional<Department> optionalDepartment = deptRepo.findById(1);
		
		Optional<Employee> optionalEmployee = empRepo.findById(1);
		
		if(optionalEmployee.isPresent()) {
			
			Employee employee = optionalEmployee.get();
			
			if(optionalDepartment.isPresent()) {
				Department dept = optionalDepartment.get();
				System.out.println(dept);
				employee.setEmpName("Updated Name");
				employee.setDepartment(dept);
				empRepo.save(employee);
			}
		}
	}
}
