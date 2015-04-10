package service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Department;
import entity.Employee;

public class OneToMany {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPATutorial");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		//Create Employee1 Entity
		Employee employee1=new Employee();
		employee1.setEname("Nonoko");
		employee1.setSalary(45000);
		employee1.setDeg("Technical Writer");
		
		//Creante Employee2 Entity
		Employee employee2=new Employee();
		employee2.setEname("Emiko");
		employee2.setSalary(45000);
		employee2.setDeg("Technical Writer");
		
		//Create Employee3 Entity
		Employee employee3=new Employee();
		employee3.setEname("Kyohei");
		employee3.setSalary(50000);
		employee3.setDeg("Technical Writer");
		
		//Store Employee
		em.persist(employee1);
		em.persist(employee2);
		em.persist(employee3);
		
		//Create Employee list
		List<Employee>emplist=new ArrayList();
		emplist.add(employee1);
		emplist.add(employee2);
		emplist.add(employee3);
		
		//Create Department Entity
		Department department=new Department();
		department.setName("Development");
		department.setEmployeeList(emplist);
		
		//Store Department
		em.persist(department);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}