package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import 
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s = sf.openSession();

		Transaction t = s.beginTransaction();

//		Student s1 = new Student(1,"FirstStudent","test@email.com","123456");
//		Student s2 = new Student(2,"SecondStudent","second@email.com","23456");
//		Student s3 = new Student(3,"ThirdStudent","third@email.com","34567");
//		Student s4 = new Student(4,"FourthStudent","fourth@email.com","45678");

//		s.persist(s1);  
//		s.persist(s2);  
//		s.persist(s3);  
//		s.persist(s4);  
		
		Student stu = s.get(Student.class,1);
		System.out.println(stu);
		
		s.remove(stu);

		t.commit();
		s.close();
		sf.close();

		
//		s.save(s1);
//		Transaction t = s.beginTransaction();
//		t.commit();
		
	}

}
