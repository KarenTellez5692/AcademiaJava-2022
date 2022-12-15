package com.luv2code.springboot.cruddemo.entity;

import javax.persistence.*;
import lombok.*;

@Data 
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name="asegurados")
public class Asegurado {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="rfc")
	private String rfc;
	
	@Column(name="numpoliza")
	private String numpoliza;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="email")
	private String email;
	
}











