package com.jsp.Driver;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onetomanyBi.pack.Outdoor;
import com.onetomanyBi.pack.Sport;

public class Test1 {

	public static void main(String[] args) {
		List<Outdoor>lio=new ArrayList<Outdoor>();
		//List<Sport>lis=new ArrayList<Sport>();
		
		Sport sp = new Sport();
		sp.setSportname("AllOutdoors");
		sp.setSportcountry("World");
		
		Outdoor ot1=new Outdoor();
		ot1.setOutdoorname("cricket");
		ot1.setLoc("England");
		ot1.setSp(sp);
		
		Outdoor ot2=new Outdoor();
		ot2.setOutdoorname("Hockey");
		ot2.setLoc("India");
		ot2.setSp(sp);
		
		lio.add(ot1);
		lio.add(ot2);
		
		sp.setOut(lio);
		
//		lis.add(sp);
//		
//		ot1.setSpo(lis);
//		ot2.setSpo(lis);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(ot1);
		em.persist(ot2);
		em.persist(sp);
		et.commit();
	}

}
