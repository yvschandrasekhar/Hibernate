package com.jsp.Driver;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchPerson {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		String q = "select p from Person p where p.name=?1";
		//em.find(Identity.class, 1);
		Query query = em.createQuery(q);
		query.setParameter(1, "yvs");
		List li = query.getResultList();
		Iterator i=li.iterator();
		while(i.hasNext()) {
			System.out.println(i.next()+" ");
		}
	}

}
