package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	//using custom queries (JPQL)
//	@Query("SELECT e from Employee e WHERE e.city = :ct")
//	public List<Employee> fetchAllEmployeesByCity(@Param("ct") String city);
//	
//	@Query("SELECT e from Employee e WHERE e.salary >= :salary")
//	public List<Employee> fetchAllEmployeesbySalaryRange(double salary);
	
	//using QueryMethods
	
	List<Employee> findAllByCity(String city);
	
	List<Employee> findAllBySalaryGreaterThan(double salary);
	
	Employee findByEmailAndEmpName(String email, String name);
	
	List<Employee> findAllByCityAndSalaryGreaterThan(String city, double salary);
	
	List<Employee> findAllByDepartmentDeptName(String deptName);
	
	
	//namedQuery
	@Query(name = "Employee.countEmployees")
	int countEmployees();
	
	@Query("SELECT count(*) FROM Employee e")
	int getCount();
	
	
	//using custom queries (native sql)
//	@Query(value="SELECT * FROM employee where city=:city", nativeQuery = true)
//	public List<Employee> fetchAllEmployeesByCity(String city);

}
