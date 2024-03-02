package com.hiberanate.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCollege {

	public static void main(String[] args) {
	
		College cl1 = new College();
		cl1.setCollegeid(3);
		cl1.setCollegename("Vishnu");
		cl1.setCollegeloc("BHIM");
		
		College cl2 = new College();
		cl2.setCollegeid(4);
		cl2.setCollegename("Srkr");
		cl2.setCollegeloc("BHIM");
		 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("yvs");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(cl1);
		em.persist(cl2);
		et.commit();
	}

}
