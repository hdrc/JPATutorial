package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import entity.Employee;

public class CriteriaApi {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPATutorial");
		EntityManager em=emf.createEntityManager();
		
		CriteriaBuilder criteriaBuilder=em.getCriteriaBuilder();
		CriteriaQuery<Object>criteriaQuery=criteriaBuilder.createQuery();
		Root<Employee>from=criteriaQuery.from(Employee.class);
		
		//Select all records
		System.out.println("Select all records");
		CriteriaQuery<Object>select=criteriaQuery.select(from);
		TypedQuery<Object>tipedQuery=em.createQuery(select);
		List<Object>resultlist=tipedQuery.getResultList();
		for(Object o:resultlist){
			Employee e=(Employee) o;
			System.out.println("ID:"+e.getEid()+" Name: "+e.getEname());
		}
		
		//Ordering the records
		System.out.println("Select all record by folloy ordering");
		CriteriaQuery<Object>select1=criteriaQuery.select(from);
		select1.orderBy(criteriaBuilder.asc(from.get("ename")));
		TypedQuery<Object>typedquery1=em.createQuery(select);
		List<Object>resultlist1=typedquery1.getResultList();
		for(Object o:resultlist1){
			Employee e=(Employee) o;
			System.out.println("ID:"+e.getEid()+" Name: "+e.getEname());
		}
	}
}