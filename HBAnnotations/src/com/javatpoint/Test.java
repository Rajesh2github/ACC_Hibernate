package com.javatpoint;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {
public static void main(String[] args) {
	Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
	
	Transaction t=session.beginTransaction();
	
	//Set<Address> ad = new HashSet<Address>();
	Student s= new Student();
	/*s.setName("Rajesh"+Math.random());
	Vehicle v= new Vehicle();
	v.setName("jeep");
	v.setStudent(s);
	//s.getVehicle().add(v);
	//s.getVehicle().add(v1);
	Integer ss= (Integer) session.save(s);
	System.out.println(ss);
	//v=(Vehicle) session.get(Vehicle.class,5); 
	System.out.println(v.getId());
	System.out.println(v.getName());
	System.out.println(v.getStudent().getId());*/
	Query query = session.createQuery("from Vehicle where id=?");
	query.setInteger(0, 5);
	List<Vehicle> l=query.list();
   Iterator<Vehicle> itr = l.iterator();
   Vehicle v1=null;
   int sid;
   while(itr.hasNext()){
	   v1= itr.next();
	  System.out.println(v1.getStudent().getId());
   }
	   
	t.commit();
	session.close();
	/*Address addr = new Address();
	addr.setCity("pune");
	addr.setStreet("magrpatta");
	
	Address addr2 = new Address();
	addr2.setCity("pune2");
	addr2.setStreet("dhdfh");
	ad.add(addr);
	ad.add(addr2);
	s.getAddress().add(addr2);
	s.getAddress().add(addr);
	//s.setAddress(ad);
	
	
	s.setName("Rajesh raju Tiwari");
	s.setJoinDate(new Date());
	session.persist(s);
	t.commit();
	System.out.println("successfully saved");
	
	// get tha data bake from DB
	session.close();*/
	/*session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
	t=session.beginTransaction();
	
	Student s1 =(Student)session.get(Student.class, 102);
	System.out.println(s1.getId()+" : "+s1.getName()+" : "+s1.getJoinDate());*/
	
}
}
