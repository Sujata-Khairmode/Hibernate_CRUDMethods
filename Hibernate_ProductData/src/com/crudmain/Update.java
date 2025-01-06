package com.crudmain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Product;

public class Update {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Product.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss =sf.openSession();
		Transaction tr=ss.beginTransaction();
		int id=3;
		Product p1=ss.get(Product.class, id);
		p1.setWgt(300);
p1.setName("Vaseline Body Loation");
ss.merge(p1);
tr.commit();
ss.close();
System.out.println("product name updated successfully..");
	}

}