package com.basic.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {
		Bat b1 = new Bat();
		b1.setBatbrand("puma");
		b1.setPrice(500);
		
		Bat b2 = new Bat();
		b2.setBatbrand("Mrf");
		b2.setPrice(700);
		
		Bat b3 = new Bat();
		b3.setBatbrand("Rbk");
		b3.setPrice(1000);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		et.commit();
	}

}
