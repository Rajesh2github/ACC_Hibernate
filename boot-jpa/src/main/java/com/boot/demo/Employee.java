package com.boot.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employree")
public class Employee {
	@Value("101")
	private int id;
	
	@Value("Rajesh")
	private String name;
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
	
	@PostConstruct
	public void m1(){
		System.out.println("post constructor call");
	}
	
}
