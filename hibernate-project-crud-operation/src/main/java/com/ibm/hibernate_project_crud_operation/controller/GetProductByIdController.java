package com.ibm.hibernate_project_crud_operation.controller;

import com.ibm.hibernate_project_crud_operation.dao.ProductDao;
import com.ibm.hibernate_project_crud_operation.dto.Product;

public class GetProductByIdController {
	public static void main(String[] args) {
		ProductDao dao= new ProductDao();
		
		Product product=dao.getProductByIdDao(12);
		if(product!=null) {
			System.out.println(product);
		} else {
			System.out.println("No data fetched");
		}
	}
}
