package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.Employee;

public class Ordering {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPATutorial");
		EntityManager em=emf.createEntityManager();
		
		Query query=em.createQuery("Select e from Employee e ORDER BY e.ename ASC");
		List<Employee>list=query.getResultList();
		for(Employee e:list){
			System.out.print("ID: "+e.getEid());
			System.out.println("\t Name: "+e.getEname());
		}
	}
}