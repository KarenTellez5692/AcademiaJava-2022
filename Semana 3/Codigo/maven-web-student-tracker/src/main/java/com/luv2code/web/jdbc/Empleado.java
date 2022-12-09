package com.luv2code.web.jdbc;

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

	public Empleado(int id, String firstName, String lastName, String email,String area) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.area = area;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", area=" + area + "]";
	}
}
