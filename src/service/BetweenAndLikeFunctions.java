package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.Employee;

public class BetweenAndLikeFunctions {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPATutorial");
		EntityManager em=emf.createEntityManager();
		
		//Between
		Query query=em.createQuery("Select e from Employee e where e.salary Between 30000 and 50000");
		List<Employee>list=query.getResultList();
		for(Employee e:list){
			System.out.print("ID: "+e.getEid());
			System.out.println("\t Salary: "+ e.getSalary());
		}
		
		//Like
		Query query1=em.createQuery("Select e from Employee e where e.ename LIKE 'M%'");
		List<Employee>list1=query1.getResultList();
		for(Employee e:list1){
			System.out.print("Employee ID: "+e.getEid());
			System.out.println("\t Employee name: "+ e.getEname());
		}
	}
}