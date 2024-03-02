package com.hiberanate.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MergeCollege {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("yvs");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		College cl3 = em.find(College.class, 3);
		cl3.setCollegeid(3);
		cl3.setCollegename("VRSID");
		cl3.setCollegeloc("VJY");
		em.merge(cl3);
		if(cl3!=null) {
			System.out.println(cl3.getCollegeid());
			System.out.println(cl3.getCollegename());
			System.out.println(cl3.getCollegeloc());
		}
		et.commit();
	}

}
