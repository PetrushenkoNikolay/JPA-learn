package findEmployee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Employee;

public class FinderEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learningJPAProject");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Employee empl = em.find(Employee.class, 35);
		System.out.println(empl);
		em.close();
		emf.close();
	}

}
