package com.example.demo.util;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Product;

public class StaticBD {

	private static List<Product> list;
	static {
		list = new ArrayList<Product>();
		list.add(new Product(101, "iphone", 25000));
		list.add(new Product(102, "GL", 20000));
		list.add(new Product(103, "MI", 12000));
		list.add(new Product(104, "Samsug LED", 250000));

	}

	public static List<Product> getList() {
		return list;
	}
}
