package com.jsp.Driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.manytoone.pack.Account;
import com.manytoone.pack.Person;

public class Test1 {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Bubbu");
		p.setAge(20);
		p.setLoc("Polavaram");
		
		Account a1 = new Account();
		a1.setBankname("SBI");
		a1.setNumber(12345);
		a1.setPer(p);
		
		Account a2 = new Account();
		a2.setBankname("ANDHRA");
		a2.setNumber(23456);
		a2.setPer(p);
		
		Account a3 = new Account();
		a3.setBankname("ICICI");
		a3.setNumber(34567);
		a3.setPer(p);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("chandu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(p);
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		et.commit();
	}

}
