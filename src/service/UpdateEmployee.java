package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Employee;

//Editar una línea de la tabla
public class UpdateEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPATutorial");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		//Elegir la línea a ser editada (NombreClase.class, PK)
		Employee employee=em.find(Employee.class, 1);
		
		System.out.println(employee);
		employee.setSalary(46000);
		em.getTransaction().commit();
		
		System.out.println(employee);
		
		em.close();
		emf.close();
	}
}