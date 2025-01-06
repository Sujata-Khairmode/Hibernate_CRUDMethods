package com.crudmain;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Customer;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class SelectAll {

	public static void main(String[] args) {
           Configuration cfg =new Configuration();
           cfg.configure("hibernate.cfg.xml");
           cfg.addAnnotatedClass(Customer.class);
           
           SessionFactory sf=cfg.buildSessionFactory();
           Session ss =sf.openSession();
           Transaction tr=ss.beginTransaction();
           
           CriteriaBuilder hcb=ss.getCriteriaBuilder();
           CriteriaQuery<Object>cq=hcb.createQuery();
           Root<Customer> root=cq.from(Customer.class);
           cq.select(root);
           Query query=ss.createQuery(cq);
           List<Customer> list=query.getResultList();
           for(Customer customer:list) {
        	   System.out.println(customer);
           }
	}

}
