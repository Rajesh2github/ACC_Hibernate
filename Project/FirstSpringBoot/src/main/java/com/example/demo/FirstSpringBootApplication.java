package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext cts = SpringApplication.run(FirstSpringBootApplication.class, args);
		Employee e= (Employee)cts.getBean("employee");
		System.out.println(e.getName()+e.getId());
		
	}
}
