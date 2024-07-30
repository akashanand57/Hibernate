package com.ibm.hibernate_simple_crud_operation.controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class UpdateEmployeeNameByJpqlController {
	public static void main(String[] args) {

		EntityManager em = Persistence.createEntityManagerFactory("hibernate-jakarta").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		String updateQuery = "update Employee e set e.name=?1 where e.id=?2";
		
		Query query = em.createQuery(updateQuery);
		
		query.setParameter(1, "Jagmeet");
		query.setParameter(2, 124);
		
		et.begin();
		
		int a=query.executeUpdate();
		if (a!=0) {
			et.commit();
			System.out.println("Data Updated");
		} else {
			System.out.println("Given id is not found");
		}
	}
}
