package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Indian;
import com.jsp.dto.PanCard;

public class Test9 {

	public static void main(String[] args) {
		PanCard pc = new PanCard();
		pc.setPannumber(4321);
		pc.setAddress("rjy");
		
		Indian id = new Indian();
		id.setIndianname("yvs");
		id.setIndianage("20");
		id.setPc(pc);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(pc);
		em.persist(id);
		et.commit();
		
	}

}
