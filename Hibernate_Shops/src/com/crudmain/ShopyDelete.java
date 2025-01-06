package com.crudmain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Shops;

public class ShopyDelete {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Shops.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		int id=2;
		Shops s1=ss.get(Shops.class, id);
		ss.remove(s1);
		tr.commit();
		ss.close();
		System.out.println("Data is deleted...!");
		
		
		
	}
	

}
