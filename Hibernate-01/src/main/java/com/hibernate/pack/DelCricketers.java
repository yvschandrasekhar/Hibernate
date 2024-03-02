package com.hibernate.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DelCricketers {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Cricketers cricket = em.find(Cricketers.class, 3);
		em.remove(cricket);;
		et.commit();
	}

}
