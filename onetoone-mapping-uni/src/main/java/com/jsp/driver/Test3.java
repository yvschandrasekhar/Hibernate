package com.jsp.driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Test3 {

	public static void main(String[] args) {
		String q = "select P from Person P";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery(q);
		
		List li = query.getResultList();
		while(li!=null)
		{
			for(Object ob:li) {
				System.out.print(ob);
			}
		}
	}

}
