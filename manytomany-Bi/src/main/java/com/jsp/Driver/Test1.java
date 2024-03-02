package com.jsp.Driver;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.manytomanyBI.pack.Student;
import com.manytomanyBI.pack.Subject;

public class Test1 {

	public static void main(String[] args) {
		List<Student>listu=new ArrayList<Student>();
		List<Subject>lisub=new ArrayList<Subject>();
		
		Student st1=new Student();
		st1.setStudname("chandu");
		st1.setLoc("hyd");
		st1.setMarks(100);
		
		
		Student st2=new Student();
		st2.setStudname("sai");
		st2.setLoc("bang");
		st2.setMarks(100);
		
		listu.add(st1);
		listu.add(st2);
		
		Subject su1=new Subject();
		su1.setSubname("java");
		su1.setTrainername("Raveesh sir");
		su1.setDuration(120);
		
		
		Subject su2=new Subject();
		su2.setSubname("sql");
		su2.setTrainername("Joshna mam");
		su2.setDuration(120);
		
		lisub.add(su1);
		lisub.add(su2);
		
		st1.setSub(lisub);
		st2.setSub(lisub);
		su1.setStud(listu);
		su2.setStud(listu);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("chandu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(st1);
		em.persist(st2);
		em.persist(su1);
		em.persist(su2);
		et.commit();
	}

}
