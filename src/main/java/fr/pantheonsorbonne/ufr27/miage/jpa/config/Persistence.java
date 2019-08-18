package fr.pantheonsorbonne.ufr27.miage.jpa.config;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Persistence {

	
	private final EntityManagerFactory factory = javax.persistence.Persistence.createEntityManagerFactory("mysql");

	@Produces
	public EntityManager getEM() {
		EntityManager em = factory.createEntityManager();
		return em;
	}

}
