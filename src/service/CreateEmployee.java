package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Employee;

public class CreateEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPATutorial");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Employee employee=new Employee();
		employee.setEname("Kelly");
		employee.setSalary(40000);
		employee.setDeg("Estudiante");
		
		em.persist(employee);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}