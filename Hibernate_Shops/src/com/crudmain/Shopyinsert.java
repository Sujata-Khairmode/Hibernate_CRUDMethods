package com.crudmain;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Shops;

public class Shopyinsert {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Shops.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		Shops sh= new Shops();
	    sh.setS_name("Sai");
		sh.setP_name("GeneralStore");
		sh.setAddress("Gondi");
	   
		
		ss.persist(sh);
		tr.commit();
		ss.close();
		System.out.println("Application is started....!");
		
	}

}
