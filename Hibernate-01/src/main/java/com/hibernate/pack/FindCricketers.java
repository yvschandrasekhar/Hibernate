package com.hibernate.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
	
public class FindCricketers {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		
		Cricketers cric = em.find(Cricketers.class, 1);
		if(cric!=null) {
			System.out.println(cric.getCricketerid());
			System.out.println(cric.getCricketername());
			System.out.println(cric.getCricketteam());
		}
	}

}
