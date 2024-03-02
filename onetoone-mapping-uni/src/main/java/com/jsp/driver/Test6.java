package com.jsp.driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Person;

public class Test6 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		
		String q = "select p from Person p where p.name=?1 and p.age=?2";//position parameter
		
		Query query = em.createQuery(q);
		query.setParameter(1, "sai sashank");
		query.setParameter(2, 23);
		List<Person> list = query.getResultList();
		if(list!=null) {
			System.out.println("--------------------------------");
			for(Person o:list) {
				System.out.println(o);
			}
		}
	}

}
