package com.prowings;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Project Started...");
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Employee emp = new Employee();
		emp.setEmpid(123);
		emp.setName("Santosh");
		emp.setAddress("A.NAGAR");
		
//		Creating student 
		Student s1 = new Student();
		s1.setId(15);
		s1.setName("Shree");
		
		Student s2 = new Student();
		s2.setId(10);
		s2.setName("Sanjay");
		
		Student s3 = new Student();
		s3.setId(20);
		s3.setName("santosh");
		
		Student s4 = new Student();
		s4.setId(25);
		s4.setName("shubham");
		
//		Creating object of address class
		Address ad =new Address();
		ad.setStreet("street1");
		ad.setCity("PUNE");
		
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(1234.234);
//		Reading image 
		FileInputStream fis= new FileInputStream("src/main/java/Hanuman image.jpg");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		ad.setImage(data);
		
		Session session = factory.openSession();
		
		Transaction tx= session.beginTransaction();
		
		session.save(emp);
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		
//		session.delete(s4);

		session.save(ad);
		
		
		tx.commit();
		session.close();
		
System.out.println("Completed execution ");		
		
	}
}
