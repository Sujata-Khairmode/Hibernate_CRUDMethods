package com.crudmain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Customer;

/**
 * 
 */
public class InsertMainClass {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Customer.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Customer c=new Customer();
		
		c.setFname("sagar");
		c.setLname("thorat");
		c.setMobileNo(8034646236l);
		c.setAddress("mumbai");
		ss.persist(c);
		tr.commit();
		ss.close();
		System.out.println("Application is started....!");
	}

}
