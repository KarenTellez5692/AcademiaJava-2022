package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.model.Asegurado;

public interface AseguradoService {

	public List<Asegurado> getAsegurados();

	public void saveAsegurado(Asegurado theAsegurado);

	public Asegurado getAsegurado(int theId);

	public void deleteAsegurado(int theId);
	
}
