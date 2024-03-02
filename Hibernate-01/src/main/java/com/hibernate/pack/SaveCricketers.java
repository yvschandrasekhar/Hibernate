package com.hibernate.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCricketers {

	public static void main(String[] args) {
		Cricketers cri1=new Cricketers();
		cri1.setCricketername("Dhoni");
		cri1.setCricketteam("India");
		
		Cricketers cri2=new Cricketers();
		cri2.setCricketername("ViratKohli");
		cri2.setCricketteam("India");
		
		Cricketers cri3=new Cricketers();
		cri3.setCricketername("Gayle");
		cri3.setCricketteam("WestIndies");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(cri1);
		em.persist(cri2);
		em.persist(cri3);
		et.commit();
	}

}
