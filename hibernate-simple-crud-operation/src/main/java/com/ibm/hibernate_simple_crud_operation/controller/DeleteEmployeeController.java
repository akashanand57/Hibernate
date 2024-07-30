package com.ibm.hibernate_simple_crud_operation.controller;

import com.ibm.hibernate_simple_crud_operation.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteEmployeeController {
	public static void main(String[] args) {
		EntityManager em=Persistence.createEntityManagerFactory("hibernate-jakarta").createEntityManager();
		EntityTransaction et=em.getTransaction();
		Employee emp=em.find(Employee.class, 123);
		
		if (emp !=null) {
			et.begin();
			em.remove(emp);
			et.commit();
		}
	}
}
