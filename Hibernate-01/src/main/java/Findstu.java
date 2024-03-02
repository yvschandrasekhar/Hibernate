import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Findstu {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("chandu");
		EntityManager em=emf.createEntityManager();
//		EntityTransaction et=em.getTransaction();
//		et.begin();
		Student st=em.find(Student.class, 2);
		if(st!=null)
		{
			System.out.println(st.getid());
			System.out.println(st.getname());
			System.out.println(st.getage());
			System.out.println(st.getgender());
		}
	}

}
