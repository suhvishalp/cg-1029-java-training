package com.demo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_table")
public class Employee {
	
	@Id
	@Column(name = "emp_id")
	private int id;
	
	@Column(name = "employee_name")
	private String empName;
	private String city;
	private double Salary;
	private String companyName;
	
	public Employee() {
		super();
	}

	public Employee(int id, String empName, String city, double salary) {
		super();
		this.id = id;
		this.empName = empName;
		this.city = city;
		Salary = salary;
	}

	
	
	
	public Employee(int id, String empName, String city, double salary, String companyName) {
		super();
		this.id = id;
		this.empName = empName;
		this.city = city;
		Salary = salary;
		this.companyName = companyName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", empName=" + empName + ", city=" + city + ", Salary=" + Salary + "]";
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	

}
