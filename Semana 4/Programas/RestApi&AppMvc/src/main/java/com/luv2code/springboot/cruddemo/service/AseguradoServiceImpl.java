package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.dao.AseguradoDAO;
import com.luv2code.springboot.cruddemo.entity.Asegurado;

@Service
public class AseguradoServiceImpl implements AseguradoService {

	
	private AseguradoDAO aseguradoDAO;
	
	@Autowired
	public AseguradoServiceImpl(@Qualifier("aseguradoDAOJdbcImpl") AseguradoDAO theAseguradoDAO) {
		aseguradoDAO = theAseguradoDAO;
	}
	
	@Override
	@Transactional
	public List<Asegurado> findAll() {
		return aseguradoDAO.findAll();
	}

	@Override
	@Transactional
	public Asegurado findById(int theId) {
		return aseguradoDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Asegurado theEmployee) {
		aseguradoDAO.save(theEmployee);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		aseguradoDAO.deleteById(theId);
	}

}






