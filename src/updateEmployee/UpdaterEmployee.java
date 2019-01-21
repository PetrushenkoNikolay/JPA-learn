package updateEmployee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Employee;

public class UpdaterEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learningJPAProject");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Employee employee=em.find(Employee.class, 35);
		System.out.println(employee);
		employee.setDeg("senior developer");
		employee.setEasalary(5000.00);
		employee.setEname("Nickolas");
		em.getTransaction().commit();
		em.getTransaction().begin();
		employee=em.find(Employee.class, 35);
		System.out.println(employee);
		em.close();
		emf.close();
	}

}
