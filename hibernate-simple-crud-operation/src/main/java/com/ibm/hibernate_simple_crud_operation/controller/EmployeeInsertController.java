package com.ibm.hibernate_simple_crud_operation.controller;

import java.time.LocalDate;

import com.ibm.hibernate_simple_crud_operation.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeInsertController {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate-jakarta");
		
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction et=em.getTransaction();
		
		Employee emp = new Employee(124, "Jagmeet", "js@gmail.com", 456789, 200000, LocalDate.parse("1997-10-13"), LocalDate.parse("2010-11-05"));
		
		try {
			et.begin();
			em.persist(emp);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
