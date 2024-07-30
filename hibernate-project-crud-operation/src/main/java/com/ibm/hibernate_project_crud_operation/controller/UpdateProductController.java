package com.ibm.hibernate_project_crud_operation.controller;

import com.ibm.hibernate_project_crud_operation.dao.ProductDao;
import com.ibm.hibernate_project_crud_operation.dto.Product;

public class UpdateProductController {
	public static void main(String[] args) {
		
		ProductDao dao=new ProductDao();
		Product p=dao.updateProductNameByIdDao(12, "Chips");
		
		if(p!=null) {
			System.out.println("Data is Updated");
		}
		else {
			System.out.println("Data Not Updated");
		}
	}
}
