package com.luv2code.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actors")
public class Actor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idactors")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "typeactor")
	private String typeActor;
	
	public Actor() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTypeActor() {
		return typeActor;
	}

	public void setTypeActor(String typeActor) {
		this.typeActor = typeActor;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + ", lastname=" + lastname + ", phone=" + phone + ", typeActor="
				+ typeActor + "]";
	}
	
	
}
