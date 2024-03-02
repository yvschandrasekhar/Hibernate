package com.jsp.driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Person;

public class Test7 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		
		String q = "select p from Person p where p.name=:abc and p.age=:xyz";//named parameters
		
		Query query = em.createQuery(q);
		query.setParameter("abc", "sai sashank");
		query.setParameter("xyz", 23);
		List<Person> list = query.getResultList();
		if(list!=null) {
			System.out.println("--------------------------------");
			for(Person o:list) {
				System.out.println(o);
			}
		}
	}

}
