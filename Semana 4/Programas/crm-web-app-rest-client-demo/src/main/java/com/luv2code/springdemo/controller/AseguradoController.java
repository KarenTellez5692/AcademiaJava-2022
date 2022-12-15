package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.model.Asegurado;
import com.luv2code.springdemo.service.AseguradoService;

@Controller
@RequestMapping("/asegurados")
public class AseguradoController {

	// need to inject our asegurado service
	@Autowired
	private AseguradoService aseguradoService;
	
	@GetMapping("/list")
	public String listasegurados(Model theModel) {
		
		// get asegurados from the service
		List<Asegurado> tempAsegurados = aseguradoService.getAsegurados();
		System.out.println("Los asegurados: " + tempAsegurados);		
		// add the asegurados to the model
		theModel.addAttribute("asegurados", tempAsegurados);
		System.out.println("Esté es el model: " + theModel);
		
		return "list-asegurados";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Asegurado theasegurado = new Asegurado();
		
		theModel.addAttribute("asegurado", theasegurado);
		
		return "asegurado-form";
	}
	
	@PostMapping("/saveAsegurado")
	public String saveAsegurado(@ModelAttribute("asegurado") Asegurado theAsegurado) {
		
		// save the asegurado using our service
		aseguradoService.saveAsegurado(theAsegurado);	
		
		return "redirect:/asegurados/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("aseguradoId") int theId,
									Model theModel) {
		
		// get the customer from our service
		Asegurado theAsegurado = aseguradoService.getAsegurado(theId);	
		
		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("asegurado", theAsegurado);
		
		// send over to our form		
		return "asegurado-form";
	}
	
	@GetMapping("/delete")
	public String deleteasegurado(@RequestParam("aseguradoId") int theId) {
		
		// delete the asegurado
		aseguradoService.deleteAsegurado(theId);
		
		return "redirect:/asegurados/list";
	}
}