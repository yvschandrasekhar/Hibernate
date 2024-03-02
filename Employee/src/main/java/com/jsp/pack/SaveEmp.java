package com.jsp.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmp {

	public static void main(String[] args) {
		CompositeForEmp cm = new CompositeForEmp(101 , "chandu");
		Employee emp = new Employee(cm , "Banglore" , 54452);
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(emp);
		et.commit();
	}

}