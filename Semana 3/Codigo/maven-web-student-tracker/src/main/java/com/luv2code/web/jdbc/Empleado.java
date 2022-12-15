package com.luv2code.web.jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data 
 @AllArgsConstructor
public class Empleado {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String area;

	public Empleado(String firstName, String lastName, String email, String area) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.area = area;
	}


	}

