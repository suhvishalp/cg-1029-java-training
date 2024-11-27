package com.demo;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("main program");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mypersistence-unit-01");
		
		EntityManager entityManager = factory.createEntityManager();
		
//		Employee employee = new Employee(103, "Rohan", "Hyderabad", 5000.00);
//		
//		entityManager.getTransaction().begin();
//		entityManager.persist(employee);
//		entityManager.getTransaction().commit();
		
//		entityManager.getTransaction().begin();
//		Employee emp = entityManager.find(Employee.class, 101);
//		
//		System.out.println(emp);
//		emp.setCity("Hyderabad");
//		emp.setSalary(6300);
//		entityManager.persist(emp);
//		entityManager.getTransaction().commit();
//		
//		emp = entityManager.find(Employee.class, 101);
//		System.out.println(emp);
		
//		entityManager.getTransaction().begin();
//		Employee emp = entityManager.find(Employee.class, 101);
//		entityManager.remove(emp);
//		entityManager.getTransaction().commit();
		
	}

}
