package com.cache.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmp {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Geon");
		emp.setSalary(10000);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(emp);
		et.commit();
	}
}
