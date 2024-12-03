package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.model.Employee;
import com.demo.repositories.EmployeeRepository;

@SpringBootTest
class Day1203SpringDataJpaRelationshipsApplicationTests {
	
//	@Autowired
//	private DepartmentRepository deptRepo;
//	
	@Autowired
	private EmployeeRepository empRepo;
	
//	@Autowired
//	private UserRepository userRepo;
	
//	@Autowired
//	private ProfileRepository profileRepo;

	@Test
	void contextLoads() {
	}
	
//	@Test
//	void testCreateEmployee() {
//		
//		Employee emp = new Employee();
//		emp.setName("Vishal");
//		emp.setCity("Pune");
//		emp.setEmpId(10101);
//		emp.setEmpName("Vishal shah");
//		emp.setSalary(20000.00);
//		
//		empRepo.save(emp);
//	}
//	
	
//	@Test
//	public void testCreateUser() {
//		User user = new User();
//		user.setName("Aryan");
//		
//		Profile profile = new Profile();
//		profile.setBio("This is bio for Aryan");
//		profile.setDob(LocalDate.of(2000, 10, 26));
//		
//		user.setProfile(profile);
//		
////		profileRepo.save(profile);
//		userRepo.save(user);
//	}
	
//	@Test
//	@Transactional
//	public void testFindUserById() {
//		
//	 Optional<User>  userOptional =	userRepo.findById(2);
//	  
//	 User user = userOptional.isPresent() ? userOptional.get() : null;
//	 
//	 System.out.println(user.getName());
//	 
////	 System.out.println(user.getProfile().getBio());
//	}
	
	
	
	
	
	
	
	
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
	
//	@Test
//	@Transactional
//	public void testUpdateEmployeesDepartment() {
//		
//		Optional<Department> optionalDepartment = deptRepo.findById(1);
//		
//		Optional<Employee> optionalEmployee = empRepo.findById(1);
//		
//		if(optionalEmployee.isPresent()) {
//			
//			Employee employee = optionalEmployee.get();
//			
//			if(optionalDepartment.isPresent()) {
//				Department dept = optionalDepartment.get();
//				System.out.println(dept);
//				employee.setEmpName("Updated Name");
//				employee.setDepartment(dept);
//				empRepo.save(employee);
//			}
//		}
//	}
}
