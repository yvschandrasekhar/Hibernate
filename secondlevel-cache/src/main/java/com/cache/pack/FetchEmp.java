package com.cache.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchEmp {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		//EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("chandu");
		EntityManager em1 = emf.createEntityManager();
		EntityManager em2 = emf.createEntityManager();
		EntityManager em3 = emf.createEntityManager();
		EntityManager em4 = emf.createEntityManager();
		em1.find(Employee.class, 1);
		em2.find(Employee.class, 1);
		em3.find(Employee.class, 1);
		em3.find(Employee.class, 1);
		em3.find(Employee.class, 1);
		em4.find(Employee.class, 1);
	}

}
