package com.jsp.Driver;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onetomany.pack.Account;
import com.onetomany.pack.Person;

public class Test1 {

	public static void main(String[] args) {
		List<Account>list=new ArrayList<Account>();
		
		Account account1=new Account();
		account1.setBankname("SBI");
		account1.setAcNumber(12345);
		
		Account account2=new Account();
		account2.setBankname("HDFC");
		account2.setAcNumber(23456);
		
		Account account3=new Account();
		account3.setBankname("CANARA");
		account3.setAcNumber(34567);
		
		list.add(account1);
		list.add(account2);
		list.add(account3);
		
		Person per=new Person();
		per.setPname("Sashank");
		per.setAge(23);
		per.setLoc("Nellore");
		per.setAcc(list);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chandu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(account1);
		em.persist(account2);
		em.persist(account3);
		em.persist(per);
		et.commit();
	}

}
