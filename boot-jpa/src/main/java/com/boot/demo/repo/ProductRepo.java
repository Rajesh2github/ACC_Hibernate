package com.boot.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.boot.demo.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
	
 Product findByPrductId(int productId);
 
 @Query("SELECT p FROM Product p where productName = :productType")
 List<Product>  getProductByType(@Param("productType") String productType);
 
 @Query(name="product.getallhigherPriceProduct")
 List<Product>  higher(@Param("price") double price);
 @Query("SELECT p.productName FROM Product p where prductId = :prductId")
 public String getProductNameByPrductId(@Param("prductId")Integer prductId);
}
