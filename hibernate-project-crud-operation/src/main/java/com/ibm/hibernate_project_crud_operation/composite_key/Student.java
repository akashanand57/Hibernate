package com.ibm.hibernate_project_crud_operation.composite_key;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@EmbeddedId
	private StudentsId id;
	private String firstName;
	private String lastName;
	
}
