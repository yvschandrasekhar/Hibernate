package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Person;

public class Test8 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		
		String q = "select p from Person p where p.id=:sql";//named parameter
		
		Query query = em.createQuery(q);
		query.setParameter("sql", 4);
		Person per = (Person)query.getSingleResult();
		System.out.println(per);
	}

}
