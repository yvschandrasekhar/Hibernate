package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Identity;
import com.jsp.dto.Person;

public class Test2 {

	public static void main(String[] args) {
		Person p=new Person();
		p.setAddress("hyd");
		p.setAge(20);
		p.setName("chandu");
		Identity ide=new Identity();
		ide.setName("Pan card");
		ide.setNumber(1234);
		p.setIde(ide);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("chandu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(p);
		em.persist(ide);
		et.commit();
	}

}
