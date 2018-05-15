package com.java.HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {

	public static void main(String[] args) {
		Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		
		Transaction t=session.beginTransaction();
		//String id= "5 or 1=1";
		//Query query = session.createQuery("select userName from UserDetails where userId ="+id);
		//query.setInteger(0, 1); 
		//query.setString("id", "User1 or 1=1");
		//query.setFirstResult(5);
		//query.setMaxResults(2);
		Query query = session.getNamedQuery("UserDetails.byName");
		query.setString(0, "User1");
		query.setCacheable(true);
		List<UserDetails> users =(List<UserDetails>)query.list();
		
		for(UserDetails u : users)
			System.out.println(u.getUserId()+"  "+u.getUserName());
		
		session.close();
		session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		t=session.beginTransaction();
		
		query = session.getNamedQuery("UserDetails.byName");
		query.setString(0, "User1");
		query.setCacheable(true);
		users =(List<UserDetails>)query.list();
		for(UserDetails u : users)
			System.out.println(u.getUserId()+"  "+u.getUserName());
		
			t.commit();
		session.close();
	
	}
	
	
}
