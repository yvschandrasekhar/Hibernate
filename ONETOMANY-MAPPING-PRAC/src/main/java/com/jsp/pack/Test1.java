package com.jsp.pack;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test1 {

	public static void main(String[] args) {
		List<Branch>b=new ArrayList<Branch>();
		
		Branch br1 = new Branch();
		br1.setBranchName("Aravi_01");
		br1.setBrancLoc("rjy");
		
		Branch br2 = new Branch();
		br2.setBranchName("Aravi_02");
		br2.setBrancLoc("VSKP");
		
		Branch br3 = new Branch();
		br3.setBranchName("Aravi_03");
		br3.setBrancLoc("HYD");
		
		b.add(br1);
		b.add(br2);
		b.add(br3);
		
		Hospital hos = new Hospital();
		hos.setName("Aravind Orthopedics");
		hos.setSpeciality("Orthopedic");
		hos.setBran(b);
		
		br1.setHos(hos);
		br2.setHos(hos);
		br3.setHos(hos);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(hos);
		em.persist(br1);
		em.persist(br2);
		em.persist(br3);
		et.commit();
	}

}