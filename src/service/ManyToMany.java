package service;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Clas;
import entity.Teacher;

public class ManyToMany {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPATutorial");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		//Create Clas Entity
		Clas clas1=new Clas(0, "1st", null);
		Clas clas2=new Clas(0, "2nd", null);
		Clas clas3=new Clas(0, "3rd", null);
		
		//Store Clas
		em.persist(clas1);
		em.persist(clas2);
		em.persist(clas3);
		
		//Create Clas Set1
		Set<Clas>classSet1=new HashSet();
		classSet1.add(clas1);
		classSet1.add(clas2);
		classSet1.add(clas3);
		
		//Create Clas set2
		Set<Clas>classSet2=new HashSet();
		classSet2.add(clas3);
		classSet2.add(clas1);
		classSet2.add(clas2);
		
		//Create Clas set3
		Set<Clas>classSet3=new HashSet<Clas>();
		classSet3.add(clas2);
		classSet3.add(clas3);
		classSet3.add(clas1);
		
		//Create Teacher Entity
		Teacher teacher1=new Teacher(0, "Yuki", "Java", classSet1);
		Teacher teacher2=new Teacher(0, "Román", "Adv Java", classSet2);
		Teacher teacher3=new Teacher(0, "Emerson","DB2", classSet3);
		
		//Store Teacher
		em.persist(teacher1);
		em.persist(teacher2);
		em.persist(teacher3);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}