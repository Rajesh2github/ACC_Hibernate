package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("productservice")
public class ProductRestController {
	 
	@Autowired
	private ProductService productService;

	@RequestMapping("/service/employee")
	public Employee getEmployee() {

		Employee e = new Employee();
		e.setName("Rajesh");

		return e;
	}

	@RequestMapping(value = "/allproducts", method = RequestMethod.GET, produces = { "Application/json" })
	public List<Product> getAllProduct() {

		return productService.getAllProduct();
	}

	@RequestMapping(value = "/product/{Id}", method = RequestMethod.GET, produces = { "Application/json" })
	public Product getProductById(@PathVariable(name = "Id") int prductId) {

		return productService.getProduct(prductId);
	}
	@RequestMapping(value = "/products/{productType}", method = RequestMethod.GET, produces = { "Application/json" })
	public List<Product> getProductByType(@PathVariable(name = "productType") String  productType) {

		return productService.getProductByType(productType);
	}
	
	@RequestMapping(value = "/products/price/{price}", method = RequestMethod.GET, produces = { "Application/json" })
	public List<Product> getProductByPrice(@PathVariable(name = "price") double  price) {

		return productService.getProductByPrice(price);
	}

	@RequestMapping(value = "/product/{Id}", method = RequestMethod.DELETE, produces = { "Application/json" })
	public Product delProductById(@PathVariable(name = "Id") int prductId) {

		return productService.delProduct(prductId);
	}
	

	@RequestMapping(value = "/product", method = RequestMethod.POST, produces = {
			"Application/json" }, consumes = "Application/json")
	public int addProductBy(@RequestBody Product product) {

		return productService.addProduct(product);
	}

	@RequestMapping(value = "/product", method = RequestMethod.PUT, produces = {
			"Application/json" }, consumes = "Application/json")
	public Product updateProduct(@RequestBody Product product) {

		return productService.updateProduct(product);
	}

}
