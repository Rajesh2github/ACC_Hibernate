package com.java.manytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name ="STUDENT")
public class Student {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String name;
	@ManyToMany
	@JoinTable(name="STUDENT_VEHICLE",
			joinColumns = @JoinColumn(name="SID"),
			inverseJoinColumns = @JoinColumn(name="VID")
			)
	private Set<Vehicle> vehicle = new HashSet<Vehicle>(); 
	
	
	public Set<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Set<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
/*
 @Temporal(TemporalType.DATE)
	private Date joinDate;
	@CollectionOfElements(fetch=FetchType.EAGER)
	@JoinTable(name="ADDR",
	joinColumns =@JoinColumn(name ="usd"))
	private Set<Address> address = new HashSet<Address>();
	public Set<Address> getAddress() {
		return address;
	}
	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
*/
/*@Embedded
@AttributeOverrides({
@AttributeOverride(name ="street",column =@Column(name="Student_shool_str")),	
@AttributeOverride(name ="city",column =@Column(name="Student_shool_city")),
})
private Address address;
@Embedded
private Address homeaddress;
	public Address getHomeaddress() {
	return homeaddress;
}
public void setHomeaddress(Address homeaddress) {
	this.homeaddress = homeaddress;
}
	public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}*/