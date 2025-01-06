package com.crudmain;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Product;

public class Insert_MainClass {

	public static void main(String[] args) {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Product.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Product p=new Product();
		p.setCompanyName("Unilever");
		p.setName("Vaseline");
		p.setPrice(200);
		p.setWgt(100f);
		ss.persist(p);
		tr.commit();
		ss.close();
		System.out.println("appln is started");
		
	}

}
