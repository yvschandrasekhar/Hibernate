package com.jsp.Driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onetooneBI.pack.Identity;
import com.onetooneBI.pack.Person;

public class Test1 {

	public static void main(String[] args) {
		Person per=new Person();
		per.setName("yvs");
		per.setAge(22);
		per.setLoc("hyd");
		
		Identity iden=new Identity();
		iden.setIdentityname("Aadhar");
		iden.setIdentitynumber(12345);
		
		per.setIdentity(iden);
		iden.setPerson(per);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(per);
		em.persist(iden);
		et.commit();
	}

}
