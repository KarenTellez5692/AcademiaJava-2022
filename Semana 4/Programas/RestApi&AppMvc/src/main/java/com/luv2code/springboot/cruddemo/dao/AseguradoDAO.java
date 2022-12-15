package com.luv2code.springboot.cruddemo.dao;

import java.util.List;
import com.luv2code.springboot.cruddemo.entity.Asegurado;

public interface AseguradoDAO {

	List<Asegurado> findAll();
	
	Asegurado findById(int theId);
	
	void save(Asegurado theAsegurado);
	
	void deleteById(int theId);
	
}
