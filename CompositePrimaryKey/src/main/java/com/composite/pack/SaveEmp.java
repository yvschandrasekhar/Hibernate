package com.composite.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmp {

	public static void main(String[] args) {
		CompositeKeyForEmployee cke = new CompositeKeyForEmployee("101" , "sai" , "banglore" , 50000);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(cke);
		et.commit();
	}
}