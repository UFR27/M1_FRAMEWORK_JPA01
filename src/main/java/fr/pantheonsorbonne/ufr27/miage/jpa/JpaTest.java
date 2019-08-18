package fr.pantheonsorbonne.ufr27.miage.jpa;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class JpaTest {

	@Inject
	private EntityManager manager;

	
	
	
	public static void main(String[] args) throws ClassNotFoundException {

		
		SeContainerInitializer initializer = SeContainerInitializer.newInstance();

		try (SeContainer container = initializer.addPackages(true,JpaTest.class.getPackage()).initialize()) {
			JpaTest jpa = container.select(JpaTest.class).get();
			EntityTransaction tx = jpa.manager.getTransaction();
			tx.begin();
			try {
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			tx.commit();
	
			
	
			System.out.println(".. done");
			
		}

	}

	

}
