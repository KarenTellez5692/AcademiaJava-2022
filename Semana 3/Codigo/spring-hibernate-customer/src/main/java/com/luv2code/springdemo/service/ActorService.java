package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Actor;

public interface ActorService {
	
	public List<Actor> getActors();

	public void saveActor(Actor actor);

	public Actor getActor(int id);

	public void deleteActor(int id);

}
