package com.java.inharitance;

import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("BYKE")
public class TwoWhl extends VehicleINR{
 private String Handel;

public String getHandel() {
	return Handel;
}

public void setHandel(String handel) {
	Handel = handel;
}
 
}
