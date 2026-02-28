package com.emp;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class Driver {

    public static void main(String[] args) {

    	// TODO Auto-generated method stub
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	cfg.addAnnotatedClass(Employee.class);
    		
    	SessionFactory sf = cfg.buildSessionFactory();
    		
    	Session session = sf.openSession();

    	Transaction t = session.beginTransaction();

        // Insert
        Employee emp = new Employee(1, "John", 50000);
        session.persist(emp);

        // Fetch
        Employee fetched = session.get(Employee.class, 1);
        System.out.println(fetched.getName());

        // Update
        fetched.setSalary(60000);
        session.update(fetched);

        // Delete
        session.delete(fetched);

        t.commit();
        session.close();
        sf.close();
    }
}