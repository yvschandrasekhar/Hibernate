package com.jsp.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCar {

	public static void main(String[] args) {
		Car c = new Car(104 , "Ertiga" , "Et800" , 200000);//Transient Stage
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(c);
		c.setBrand("ET100");
		c.setName("Audi");
		et.commit();
		em.detach(c);
		c.setBrand("Aux");
		System.out.println(c);
	}

}
