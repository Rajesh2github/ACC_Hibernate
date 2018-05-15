package com.java.inharitance;

import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("CAR")
public class ForWhl extends VehicleINR{

	 private  String steering;

	public String getSteering() {
		return steering;
	}

	public void setSteering(String steering) {
		this.steering = steering;
	}
	 
}
