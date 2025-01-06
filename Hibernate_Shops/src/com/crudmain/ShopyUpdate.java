package com.crudmain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Shops;

public class ShopyUpdate {
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Shops.class);		
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		int id=3;
		Shops s1=ss.get(Shops.class, id);
		s1.setP_name("shop");
		ss.merge(s1);
		System.out.println("data is updated sucessfully..");
	    tr.commit();
	    ss.close();
	}
	

}
