package com.jsp.Driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onetooneBI.pack.Person;

public class Test2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		em.find(Person.class, 1);
//		String q = "select p from Person p where p.id=:sql";
//		
//		Query query = em.createQuery(q);
//		query.setParameter("sql", 4);
//		Person per = (Person)query.getSingleResult();
//		System.out.println(per);
	}

}
