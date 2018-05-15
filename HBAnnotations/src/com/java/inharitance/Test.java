package com.java.inharitance;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {
public static void main(String[] args) {
	Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
	
	Transaction t=session.beginTransaction();
	 VehicleINR vehicle = new VehicleINR();
	 vehicle.setName("Any Vehicle");
	 
	 ForWhl forWhl = new ForWhl();
	 forWhl.setName("Car");
	 forWhl.setSteering("gol gol");
	 
	 TwoWhl twoWhl = new TwoWhl();
	 twoWhl.setName("Byk");
	 twoWhl.setHandel("sidho");
	 
	 session.save(vehicle);
	 session.save(forWhl);
	 session.save(twoWhl);
	 t.commit();
	 session.close();
	

}
}
