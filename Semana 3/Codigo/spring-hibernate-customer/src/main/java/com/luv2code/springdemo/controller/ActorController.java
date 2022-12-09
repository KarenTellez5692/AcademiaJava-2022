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

import com.luv2code.springdemo.entity.Actor;
import com.luv2code.springdemo.service.ActorService;

@Controller
@RequestMapping("/actor")
public class ActorController {
	
	// Se necesita inyectar el service de actor
	@Autowired
	private ActorService actorService;
	
	@GetMapping("/list")
	public String listActors(Model model) {
		
		// obtiene la lista de actores desde el servicio
		List<Actor> actors = actorService.getActors();
		
		//añadimos los actores al model
		model.addAttribute("actors", actors);
		
		return "list-actors";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		// Crea el model para guardar un actor
		Actor actor = new Actor();
		
		// Se añade la instancia del entity al modelo
		model.addAttribute(actor);
		
		return "actor-form";
	}
	
	@PostMapping("/saveActor")
	public String saveActor(@ModelAttribute("actor") Actor actor) {
		// Guarda al actor usando el servicio
		actorService.saveActor(actor);
		
		return "redirect:/actor/list";
	}
	
	@GetMapping("showFormForUpdate")
	public String showFormForUpdate(@RequestParam("actorId") int id,
									Model model) {
		// Se obtiene al actor desde el servicio a partir de su id
		Actor actor = actorService.getActor(id);
		System.out.println("El bendito actor: " + actor);
		// setea al actor como un atributo del model para pre-rellenar el formulario
		model.addAttribute(actor);
		
		// retornamos la vista con el formulario
		return "actor-form";
	}
	
	@GetMapping("/delete")
	public String deleteActor(@RequestParam("actorId") int id) {
		// elimina al actor
		actorService.deleteActor(id);
		
		return "redirect:/actor/list";
	}

}
