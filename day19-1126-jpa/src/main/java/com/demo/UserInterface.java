package com.demo;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("main program");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mypersistence-unit-01");
		
		EntityManager manager = factory.createEntityManager();
		
	}

}
