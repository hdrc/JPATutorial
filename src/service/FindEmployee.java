package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Employee;

public class FindEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPATutorial");
		EntityManager em=emf.createEntityManager();
		
		Employee employee=em.find(Employee.class, 1);
		System.out.println("ID: "+employee.getEid());
		System.out.println("Name: "+employee.getEname());
		System.out.println("Salary: "+employee.getSalary());
		System.out.println("Designation: "+employee.getDeg());
	}
}