package com.ibm.hibernate_project_crud_operation.composite_key;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDriver {
	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("hibernate-jakarta").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		StudentsId id = new StudentsId("aman@gmail.com", 9988776655L);
		
		Student student= new Student(id, "Aman", "Tiwari");
		
		et.begin();
		em.persist(student);
		et.commit();
	}
}
