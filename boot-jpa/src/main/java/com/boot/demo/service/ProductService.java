package com.boot.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.demo.entity.Product;
import com.boot.demo.exception.ProductException;
import com.boot.demo.exception.UserException;
import com.boot.demo.repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
	ProductRepo productRepo;
	
	public List<Product> getAllProduct() {
		return productRepo.findAll();
	}

	public Product getProduct(int productId) throws ProductException {
		
		Product prd = null;
		prd = productRepo.findByPrductId(productId);
		if(null != prd ){
			return prd;
		}else{
			throw new ProductException("Product not found for id: "+productId);
		}
	}
	public Product delProduct(int productId) throws ProductException {
		Product prd = null;
		prd= getProduct( productId);
		productRepo.deleteById(productId);
		
		return prd;
	}
	public int addProduct(Product product) {
		
		productRepo.saveAndFlush(product);
		return 1;
	}
	/*public Product updateProduct(Product product) {
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
	}*/
	
	public List<Product> getProductByType(String productType) {
		return productRepo.getProductByType(productType);
	}
	public List<Product> getProductByPrice(double price) {
		return productRepo.higher(price);
	}
	public String getProductNameByPrductId(int pId){
		 return productRepo.getProductNameByPrductId(pId);
	}
}
