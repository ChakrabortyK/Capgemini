package com.MappingHibJpa.MappingHibJpa;

import java.time.LocalDate;

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
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		
		

		trans.begin();

		
		Customer c1 = new Customer("TestName","test@email.com","Male",123456,LocalDate.now());
		Order o1 = new Order("A1","Burger",2,12.99,LocalDate.now());
		
		c1.setOrder(o1);
		o1.setCustomer(c1);
		
		em.persist(o1);
		em.persist(c1);
		
		trans.commit();
		
		em.close();
		emf.close();
    
    }
}
