package com.prowings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmbeddingDemo {

	public static void main(String[] args) {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Student student1 = new Student();
		student1.setId(12345);
		student1.setName("Santosh Rashinkar");
		student1.setCity("pune");
		
			
		Certificate certificate = new Certificate();
		certificate.setCourse("Java");
		certificate.setDuration("3 months");
		student1.setCertificate(certificate);
		
		Student student2 =new Student();
		student2.setId(12345);
		student2.setName("Sanjay Rashinkar");
		student2.setCity("A.nagar");
	}
}
