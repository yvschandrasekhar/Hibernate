package com.hibernate.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateCricketer {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Cricketers cr = em.find(Cricketers.class, 1);
		cr.setCricketername("Rohit Sharma");
		cr.setCricketteam("India");
		em.merge(cr);
		if(cr!=null) {
			System.out.println(cr.getCricketerid());
			System.out.println(cr.getCricketername());
			System.out.println(cr.getCricketteam());
		}
		et.commit();
	}

}
