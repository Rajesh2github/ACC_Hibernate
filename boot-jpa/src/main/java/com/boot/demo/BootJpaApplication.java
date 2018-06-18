package com.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(BootJpaApplication.class, args);
		Employee emp= (Employee) ctx.getBean("employree");
		System.out.println(emp.getId()+emp.getName());
	}
}
