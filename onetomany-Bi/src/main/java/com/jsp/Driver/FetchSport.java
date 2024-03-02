package com.jsp.Driver;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onetomanyBi.pack.Sport;

public class FetchSport {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
//		String q = "select s from Sport s where s.sportname=?1";
//		Query query = em.createQuery(q);
//		List li = query.getResultList();
//		Iterator itr = li.iterator();
		em.find(Sport.class, 1);
		
	}

}
