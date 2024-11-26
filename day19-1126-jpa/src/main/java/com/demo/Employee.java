package com.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int id;
	
	private String empName;
	private String city;
	private double Salary;
	
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
	
	

}
