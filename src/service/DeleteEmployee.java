package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Employee;

public class DeleteEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPATutorial");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Employee employee=em.find(Employee.class, 3);
		em.remove(employee);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}