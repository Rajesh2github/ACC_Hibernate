package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repo.ProductRepo;
import com.example.demo.util.StaticBD;

@Service
public class ProductService {
	@Autowired
	ProductRepo productRepo;
	
	public List<Product> getAllProduct() {
		return productRepo.findAll();
	}

	public Product getProduct(int productId) {
		
		Product prd = null;
		prd = productRepo.findByPrductId(productId);
		return prd;
	}
	public Product delProduct(int productId) {
		Product prd = null;
		prd= getProduct( productId);
		productRepo.deleteById(productId);
		
		return prd;
	}
	public int addProduct(Product product) {
		
		productRepo.saveAndFlush(product);
		return 1;
	}
	public Product updateProduct(Product product) {
		Product prd = null;
		List<Product> list = StaticBD.getList();
		for (Product productDB : list) {
			if (product.getPrductId() == productDB.getPrductId()) {
				prd = product;
			}
		}
		list.remove(prd);
		list.add(product);
		return prd;
	}
	
	public List<Product> getProductByType(String productType) {
		return productRepo.getProductByType(productType);
	}
	public List<Product> getProductByPrice(double price) {
		return productRepo.higher(price);
	}
	
}
