package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.entities.Subject;

public class SubjectDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
	EntityManager em = emf.createEntityManager();
	
	public void saveSubject(Subject subject) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(subject);
		et.commit();
	}
	public Subject getSubjectById(int id) {
		return em.find(Subject.class, id);
	}
	public List<Subject> getTeacherById(String name) {
		String q = "select s from Subject s where s.name=?1";
		Query query = em.createQuery(q);
		query.setParameter(1, name);
		List list = query.getResultList();
		return list;
	}
	public boolean updateSubject(Subject subject) {
		return true;
	}
	public void deleteSubject(int id) {
		
	}
}
