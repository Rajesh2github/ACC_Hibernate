package com.client.demo.controller;

import java.awt.List;
import java.util.Iterator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class ConsControllert {
	
	private RestTemplate temp = new RestTemplate();
	
	@RequestMapping("/total")
	public double call1() {
		String url ="";
		ResponseEntity<List> res = temp.getForEntity(url, List.class);
		List list = res.getBody();
		
		for (Product p : list) {
			
		}
	}

}
