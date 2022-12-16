package com.luv2code.springdemo.model;

public class Asegurado {

	private int id;
	private String nombre;
	private String apellido;
	private String rfc;
	private String numpoliza;	
	private String telefono;
	private String email;
	
	public Asegurado() {
		
	}
	
	public Asegurado(int id, String nombre, String apellido, String rfc, String numpoliza, String telefono,
			String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.rfc = rfc;
		this.numpoliza = numpoliza;
		this.telefono = telefono;
		this.email = email;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getNumpoliza() {
		return numpoliza;
	}
	public void setNumpoliza(String numpoliza) {
		this.numpoliza = numpoliza;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Asegurado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", rfc=" + rfc + ", numpoliza="
				+ numpoliza + ", telefono=" + telefono + ", email=" + email + "]";
	}
		
}











