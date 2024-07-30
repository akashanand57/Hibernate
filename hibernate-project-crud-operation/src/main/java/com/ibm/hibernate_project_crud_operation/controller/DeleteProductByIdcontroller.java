package com.ibm.hibernate_project_crud_operation.controller;

import com.ibm.hibernate_project_crud_operation.dao.ProductDao;

public class DeleteProductByIdcontroller {
	public static void main(String[] args) {

		ProductDao dao = new ProductDao();

		//boolean p = dao.deleteProductByIdDao(12);
		int p=dao.deleteProductByIdDaoV1(14);
		
		if(p==1) {
			System.out.println("Data deleted Successfully");
		}
		else {
			System.out.println("Data Not Deletd");
		}
	}
}
