package removeEmployee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Employee;

public class RemoverEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learningJPAProject");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Employee employee = em.find(Employee.class, 35);
		em.remove(employee);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
