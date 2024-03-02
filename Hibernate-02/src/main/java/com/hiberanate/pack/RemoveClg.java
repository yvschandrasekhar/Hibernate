package com.hiberanate.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveClg {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("yvs");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		College c = em.find(College.class, 3);
		em.remove(c);
		et.commit();
	}

}
