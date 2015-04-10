package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Department;
import entity.Employee;

public class OneToOne {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPATutorial");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		//Create Department Entity
		Department department=new Department();
		department.setName("Dev");
		
		//Store Department
		em.persist(department);
		
		//Create Employee Entity
		Employee employee=new Employee();
		employee.setEname("Dahiana");
		employee.setSalary(45000);
		employee.setDeg("Technical writer");
		employee.setDepartment(department);
		
		//Store Employee
		em.persist(employee);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}