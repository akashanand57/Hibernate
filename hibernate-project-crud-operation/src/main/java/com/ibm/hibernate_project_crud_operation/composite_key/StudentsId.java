package com.ibm.hibernate_project_crud_operation.composite_key;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class StudentsId {
	
	private String email;
	private long phone;
	
}
