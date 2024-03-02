package com.jsp.Driver;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.manytomany.pack.Student;
import com.manytomany.pack.Subject;

public class Test1 {
	public static void main(String[] args) {
		List<Subject>subj = new ArrayList<Subject>();
		
		Subject sub1=new Subject();
		sub1.setSubname("python");
		sub1.setTrainername("Harshad sir");
		sub1.setDuration(120);
		
		Subject sub2=new Subject();
		sub2.setSubname("java");
		sub2.setTrainername("Raveesh Sir");
		sub2.setDuration(120);
		
		Subject sub3=new Subject();
		sub3.setSubname("SQL");
		sub3.setTrainername("Joshna mam");
		sub3.setDuration(120);
		
		subj.add(sub1);
		subj.add(sub2);
		subj.add(sub3);
		
		Student st1 = new Student();
		st1.setStudname("chandu");
		st1.setLoc("Polavaram");
		st1.setSub(subj);
		
		Student st2 = new Student();
		st2.setStudname("chandu");
		st2.setLoc("Polavaram");
		st2.setSub(subj);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(sub1);
		em.persist(sub2);
		em.persist(sub3);
		em.persist(st1);
		em.persist(st2);
		et.commit();
	}
}
