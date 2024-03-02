package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Company;
import com.jsp.dto.GST;

public class Test1 {
	public static void main(String[] args) {
		Company com=new Company();
		com.setName("Microsoft");
		com.setAddress("Hyderbad");
		com.setNoofEmployess(2599454);
		GST gst=new GST();
		gst.setNumber("GST3364");
		gst.setCost(100000);
		com.setGst(gst);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("chandu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(com);
		em.persist(gst);
		et.commit();
	}
}
