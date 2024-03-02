import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteStu {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("chandu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Student stud=em.find(Student.class, 2);
		em.remove(stud);
		et.commit();
		//System.out.println("Data removed Successfully...");
	}

}
