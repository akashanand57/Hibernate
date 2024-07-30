package com.ibm.hibernate_simple_crud_operation.controller;

import java.util.List;
import java.util.stream.Stream;

import com.ibm.hibernate_simple_crud_operation.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class DisplayAllEmployeeController {
	public static void main(String[] args) {
		
//		EntityManager em=Persistence.createEntityManagerFactory("hibernate-jakarta").createEntityManager();

//		String selectQuery = "Select e From Employee e";
//		Query query=em.createQuery(selectQuery);
		
//		List<Employee> employees=query.getResultList();
		
		@SuppressWarnings("unchecked")
		List<Employee> emp=Persistence.createEntityManagerFactory("hibernate-jakarta")
			.createEntityManager()
			.createQuery("FROM Employee")
			.getResultList();
		
		for (Employee employee : emp) {
			System.out.println(employee);
		}
		
//		Stream<Employee> emp=query.getResultStream();
		
//		long l=emp.count();
//		System.out.println(l);
		
//		List<Employee> employees=emp.filter(a->a.getName().equalsIgnoreCase("Jagmeet")).toList();
//		
//		for (Employee employee : employees) {
//			System.out.println(employee);
//		}
	}
}
