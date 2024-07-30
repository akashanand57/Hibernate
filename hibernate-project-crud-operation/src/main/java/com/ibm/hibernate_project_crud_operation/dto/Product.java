package com.ibm.hibernate_project_crud_operation.dto;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product {

	@Id
	private int id;
	private String name;
	private String color;
	private LocalDate mfd;
	private LocalDate expd;
}
