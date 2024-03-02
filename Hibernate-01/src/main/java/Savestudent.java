import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Savestudent {

	public static void main(String[] args) {
		Student st=new Student();
		st.setid(7);
		st.setname("bubbu");
		st.setage(22);
		st.setgender("female");
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("chandu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(st);
		et.commit();
		System.out.println("Data saved successfully");
	}

}
