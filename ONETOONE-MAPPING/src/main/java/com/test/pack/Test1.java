package com.test.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hiber.pack.Pan;
import com.hiber.pack.Person;

public class Test1 {

	public static void main(String[] args) {
		
		Person pr = new Person();
		pr.setPersonname("Nobitha");
		pr.setPhoneno(123456789);
		
		Pan p = new Pan();
		p.setPanno("ABC123");
		p.setLoc("Japan");
		
		pr.setPa(p);
		p.setPerson(pr);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(pr);
		em.persist(p);
		et.commit();
		
	}

}
