import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateStu {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("chandu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Student stu=em.find(Student.class, 1);
		stu.setname("Nobitha");
		stu.setgender("male");
		em.merge(stu);
		if(stu!=null) {
			System.out.println(stu.getid());
			System.out.println(stu.getname());
			System.out.println(stu.getage());
			System.out.println(stu.getgender());
		}
		et.commit();
	}

}
