package com.javatpoint.get.load;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestGetAndLoad {

	public static void main(String[] args) {
		//Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
			/*SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction t=session.beginTransaction();*/
		/*Student s= new Student();
		s.setName("Rajesh");
		session.save(s);
		t.commit();*/
		//Student s2=(Student) session.get(Student.class, new Integer(2));
		//System.out.println(s2.getId());
		//System.out.println(s2.getName());
		
	}
}
