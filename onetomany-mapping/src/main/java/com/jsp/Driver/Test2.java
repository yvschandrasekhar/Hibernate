package com.jsp.Driver;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onetomany.pack.College;
import com.onetomany.pack.University;

public class Test2 {

	public static void main(String[] args) {
		List<College>li=new ArrayList<College>();
		
		College clg1=new College();
		clg1.setCollegename("ACET");
		clg1.setCollegeloc("SURAMPALEM");
		clg1.setCollegeRank(1);
		
		College clg2=new College();
		clg2.setCollegename("ACOE");
		clg2.setCollegeloc("KAKINADA");
		clg2.setCollegeRank(2);
		
		College clg3=new College();
		clg3.setCollegename("ACE");
		clg3.setCollegeloc("PDP");
		clg3.setCollegeRank(3);
		
		li.add(clg1);
		li.add(clg2);
		li.add(clg3);
		
		University un=new University();
		un.setUniname("JNTU");
		un.setUnirank(5);
		un.setUnniloc("HYD");
		un.setColl(li);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("chandu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(clg1);
		em.persist(clg2);
		em.persist(clg3);
		em.persist(un);
		et.commit();
	}

}
