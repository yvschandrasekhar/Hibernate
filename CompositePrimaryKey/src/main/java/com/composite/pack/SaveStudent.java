package com.composite.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudent {

	public static void main(String[] args) {
		Student st = new Student();
		st.setId(102);
		st.setName("bunty");
		st.setMarks(100);
		st.setLoc("plv");
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(st);
		et.commit();
		
	}

}
