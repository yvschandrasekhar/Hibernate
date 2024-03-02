package com.jsp.Driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.manytomanyBI.pack.Student;
import com.manytomanyBI.pack.Subject;

public class FetchStudent {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		Student student = em.find(Student.class, 1);
		List<Subject> list = student.getSub();
		Subject sub = list.get(0);
	}

}
