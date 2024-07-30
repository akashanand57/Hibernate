package com.ibm.hibernate_simple_crud_operation.controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class DeleteEmployeeJpqlController {

	public static void main(String[] args) {

		EntityManager em = Persistence.createEntityManagerFactory("hibernate-jakarta").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		String deleteQuery = "delete Employee e where e.id=?1";
		
		Query query = em.createQuery(deleteQuery);
		
		query.setParameter(1, 124);
		
		et.begin();
		
		int a=query.executeUpdate();
		if (a!=0) {
			et.commit();
			System.out.println("Data Deleted");
		} else {
			System.out.println("Given id is not found");
		}
	}
}
