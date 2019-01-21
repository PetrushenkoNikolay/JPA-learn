package createEmployee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Employee;

public class CreaterEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learningJPAProject");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Employee employee =new Employee();
		employee.setEid(35);
		employee.setEname("Nick");
		employee.setEasalary(3000.37);
		employee.setDeg("Developer");
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
