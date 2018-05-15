package com.java.manytomany;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {
public static void main(String[] args) {
	Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
	
	Transaction t=session.beginTransaction();
	
	//Set<Address> ad = new HashSet<Address>();
	Student s= new Student();
	s.setName("rajesh");
	
	Vehicle vehicle =new Vehicle();
	vehicle.setName("car");
	vehicle.getStudent().add(s);
	Vehicle vehicle2 =new Vehicle();
	vehicle2.setName("jeep");   
	vehicle2.getStudent().add(s);  
	s.getVehicle().add(vehicle);
	s.getVehicle().add(vehicle2);
	session.save(s);
	session.save(vehicle);
	session.save(vehicle2);
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
