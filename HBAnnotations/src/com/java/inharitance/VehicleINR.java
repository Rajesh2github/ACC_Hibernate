package com.java.inharitance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity(name="VAR")
@Table(name ="VEH_INR")
@Inheritance(strategy= InheritanceType.JOINED)
/*@DiscriminatorColumn(name="VEHICLE_TYPE",
discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("VEHICLE")*/
public class VehicleINR {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	private String id;
    @Column(length=10)
    private String name;
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
