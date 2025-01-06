package com.crudmain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Customer;

public class Update {

	public static void main(String[] args) {
    Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");
    cfg.addAnnotatedClass(Customer.class);
    SessionFactory sf=cfg.buildSessionFactory();
    Session ss=sf.openSession();
    Transaction tr=ss.beginTransaction();
    int id=3;
    Customer c1=ss.get(Customer.class, id);
    c1.setLname("kamble");
    ss.merge(c1);
    tr.commit();
    ss.clear();
    System.out.println("customer lname is updated..");
	}
	
	

}
