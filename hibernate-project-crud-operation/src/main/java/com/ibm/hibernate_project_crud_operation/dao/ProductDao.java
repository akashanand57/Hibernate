package com.ibm.hibernate_project_crud_operation.dao;

import java.util.List;

import com.ibm.hibernate_project_crud_operation.dto.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ProductDao {

	public Product saveProductDao(Product product) {

		try {
			EntityManager em = Persistence.createEntityManagerFactory("hibernate-jakarta").createEntityManager();
			EntityTransaction et = em.getTransaction();

			et.begin();
			em.persist(product);
			et.commit();
			return product;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Product getProductByIdDao(int productId) {
		EntityManager em = Persistence.createEntityManagerFactory("hibernate-jakarta").createEntityManager();

		return em.find(Product.class, productId);
	}

	public boolean deleteProductByIdDao(int id) {

		EntityManager em = Persistence.createEntityManagerFactory("hibernate-jakarta").createEntityManager();
		EntityTransaction et = em.getTransaction();

		Product p = getProductByIdDao(id);
		System.out.println(p);
		if (p != null) {
			try {
				et.begin();
				em.remove(p);
				et.commit();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		} else {
			return false;
		}
	}
	
	public int deleteProductByIdDaoV1(int id) {

		EntityManager em = Persistence.createEntityManagerFactory("hibernate-jakarta").createEntityManager();
		EntityTransaction et = em.getTransaction();

		Product p = getProductByIdDao(id);
		
		if(p!=null) {
			try {
				et.begin();
				int i=em.createNativeQuery("delete from product where id="+id, Product.class).executeUpdate();
				et.commit();
				return i;
			} catch (Exception e) {
				return 0;
			}
		}
		return 0;
	}
	
	
	
	public Product updateProductNameByIdDao(int id, String name) {

		EntityManager em = Persistence.createEntityManagerFactory("hibernate-jakarta").createEntityManager();
		EntityTransaction et = em.getTransaction();

		Product p = getProductByIdDao(id);
		if (p != null) {
			try {
				p.setName(name);
				et.begin();
				em.merge(p);
				et.commit();
				return p;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		} else {
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	public List<Product>getAllProductDao(){
		EntityManager em = Persistence.createEntityManagerFactory("hibernate-jakarta").createEntityManager();
		EntityTransaction et = em.getTransaction();
		//return em.createQuery("from Product").getResultList();
		return em.createNativeQuery("select * from product",Product.class).getResultList();
	}
}
