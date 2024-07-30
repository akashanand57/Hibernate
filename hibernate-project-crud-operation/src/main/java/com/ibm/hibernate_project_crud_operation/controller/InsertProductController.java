package com.ibm.hibernate_project_crud_operation.controller;

import java.time.LocalDate;

import com.ibm.hibernate_project_crud_operation.dao.ProductDao;
import com.ibm.hibernate_project_crud_operation.dto.Product;
import com.ibm.hibernate_project_crud_operation.service.ProductService;

public class InsertProductController {
	public static void main(String[] args) {
		
//		ProductDao dao = new ProductDao();
		ProductService service=new ProductService();
		
		Product product=new Product(144, "Mouse", "blue", LocalDate.parse("2022-08-05"), LocalDate.parse("2023-05-05"));
		
//		Product p=dao.saveProductDao(product);
		Product p=service.saveProductDao(product);
		
		if(p!=null) {
			System.out.println("Data Stored");
		} else {
			System.out.println("Data not stored.....");
		}	
	}
}
