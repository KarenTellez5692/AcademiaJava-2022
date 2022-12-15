package com.luv2code.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.cruddemo.entity.Asegurado;
import com.luv2code.springboot.cruddemo.service.AseguradoService;

@RestController
@RequestMapping("/api")
public class AseguradoRestController {

	private AseguradoService aseguradoService;
	
	@Autowired
	public AseguradoRestController(AseguradoService theaseguradoService) {
		aseguradoService = theaseguradoService;
	}
	
	// expose "/asegurados" and return list of Asegurados
	@GetMapping("/asegurados")
	public List<Asegurado> findAll() {
		return aseguradoService.findAll();
	}

	// add mapping for GET /Asegurados/{AseguradoId}
	
	@GetMapping("/asegurados/{aseguradoId}")
	public Asegurado getAsegurado(@PathVariable int aseguradoId) throws Exception {
		
		Asegurado theAsegurado = aseguradoService.findById(aseguradoId);
		
		if (theAsegurado == null) {
			throw new Exception("No se encuentra a un asegurado con el id - " + aseguradoId);
		}
		
		return theAsegurado;
	}
	
	// add mapping for POST /Asegurados - add new Asegurado
	
	@PostMapping("/asegurados")
	public Asegurado addAsegurado(@RequestBody Asegurado theAsegurado) {
		
		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		
		theAsegurado.setId(0);
		
		aseguradoService.save(theAsegurado);
		
		return theAsegurado;
	}
	
	// add mapping for PUT /Asegurados - update existing Asegurado
	
	@PutMapping("/asegurados")
	public Asegurado updateAsegurado(@RequestBody Asegurado theAsegurado) {
		
		aseguradoService.save(theAsegurado);
		
		return theAsegurado;
	}
	
	// add mapping for DELETE /asegurados/{AseguradoId} - delete Asegurado
	
	@DeleteMapping("/asegurados/{aseguradoId}")
	public String deleteAsegurado(@PathVariable int aseguradoId) {
		
		Asegurado tempAsegurado = aseguradoService.findById(aseguradoId);
		
		// throw exception if null
		
		if (tempAsegurado == null) {
			throw new RuntimeException("No se ha podido encontrar a ningun asegurado con el id - " + aseguradoId);
		}
		
		aseguradoService.deleteById(aseguradoId);
		
		return "Se ha eliminado al asegurado con el id - " + aseguradoId;
	}
	
}










