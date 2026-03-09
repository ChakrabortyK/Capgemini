package com.Hib.HibernateJPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("GenericDBAdapter");
    	EntityManager manager = emf.createEntityManager();
    	EntityTransaction trans = manager.getTransaction();
    	
    	trans.begin();
    	

		Student s1 = new Student("FirstStudent","test@email.com","123456");
		Student s2 = new Student("SecondStudent","second@email.com","23456");
//		Student s3 = new Student(3,"ThirdStudent","third@email.com","34567");
//		Student s4 = new Student(4,"FourthStudent","fourth@email.com","45678");
    	
		manager.persist(s1);
//		manager.persist(s2);
		
		Student student = manager.find(Student.class, 1);
		System.out.println(student);
    	
    	
//    	trans.commit();
//    	
//    	trans.begin();

    	Student studentU = manager.find(Student.class, 1);

    	if (studentU != null) {
    	    studentU.setName("UpdatedName");
    	    studentU.setEmail("updated@email.com");
    	}

//    	trans.commit();
//    	
//    	trans.begin();
//
//
//    	if (student != null) {
//    	    manager.remove(student);
//    	}

    	trans.commit();
    	
    	
    }
}
