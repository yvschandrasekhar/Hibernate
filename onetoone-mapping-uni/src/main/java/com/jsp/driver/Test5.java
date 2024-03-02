package com.jsp.driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Person;

public class Test5 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		
		String q="select p from Person p where p.id=?1";//position parameter
		
		Query query = em.createQuery(q);
//		query.setParameter(1, "sai sashank");
//		List li = query.getResultList();
//		System.out.println(li);
		query.setParameter(1, 4);
		Person p = (Person)query.getSingleResult();
		System.out.println(p);
	}

}
