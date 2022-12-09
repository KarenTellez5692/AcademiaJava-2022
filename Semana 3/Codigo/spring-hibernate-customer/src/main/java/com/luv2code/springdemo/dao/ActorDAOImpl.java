package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Actor;

@Repository
@Transactional
public class ActorDAOImpl implements ActorDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Actor> getActors() {
		// se obtiene la sesión actual de hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		
		// Se crea el query, ordenado por el apellido
		Query<Actor> queryActor = 
					 currentSession.createQuery("from Actor order by lastname", Actor.class);
		
		// Se ejecuta el query y se obtienen los datos en una lista
		List<Actor> actors = queryActor.getResultList();
		
		System.out.println("Los actores: " + actors);
		
		return actors;
	}

	@Override
	public void saveActor(Actor theActor) {
		// se obtiene la sesión actual de hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		
		// guarda o actualiza al actor
		currentSession.saveOrUpdate(theActor);
		
	}

	@Override
	public Actor getActor(int theId) {
		// se obtiene la sesión actual de hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		
		// Obtiene a un actor de la base de datos en base a su llave primaria que es el id 
		Actor actor = currentSession.get(Actor.class, theId);
		return actor;
	}

	@Override
	public void deleteActor(int theId) {
		// se obtiene la sesión actual de hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		
		// Se elimina un objeto por su llave primaria
		
		Query queryActor = currentSession.createQuery("delete from Actor where id=:actorId");
		queryActor.setParameter("actorId", theId);
		
		queryActor.executeUpdate();
		
	}

}
