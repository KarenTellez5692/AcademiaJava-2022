package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.ActorDAO;
import com.luv2code.springdemo.entity.Actor;

@Service
public class ActorServiceImpl implements ActorService {

	// Aquí injectamos el DAO
	@Autowired
	private ActorDAO actorDAO;
	
	@Override
	@Transactional
	public List<Actor> getActors() {
		// Retornamos la lista de actores
		return actorDAO.getActors();
	}

	@Override
	public void saveActor(Actor actor) {
		// Se guarda o actualiza un actor
		actorDAO.saveActor(actor);
	}

	@Override
	public Actor getActor(int id) {
		// Retornamos un actor en base a su id
		return actorDAO.getActor(id);
	}

	@Override
	public void deleteActor(int id) {
		// Se elimina un actor en base a us id
		actorDAO.deleteActor(id);
	}

}
