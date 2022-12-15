package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import com.luv2code.springboot.cruddemo.entity.Asegurado;

public interface AseguradoService {

	public List<Asegurado> findAll();
	
	public Asegurado findById(int theId);
	
	public void save(Asegurado theAsegurado);
	
	public void deleteById(int theId);
	
}
