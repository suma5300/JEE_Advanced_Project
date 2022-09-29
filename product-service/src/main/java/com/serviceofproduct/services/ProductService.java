package com.serviceofproduct.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviceofproduct.entity.Product;
import com.serviceofproduct.repos.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public Product save(Product entity) {
		return this.repo.save(entity);
	}
	
	public List<Product> findAll(){
		return this.repo.findAll();
	}
	
	public Product update(Product entity) {
		return this.repo.save(entity);
	}
	
	public List<Product> getProductsInventoryGreaterThanZero(){
		return this.repo.getProductsInventoryGreaterThanZero();
	}
	
	public List<Product> getProductsInventoryEqualToZero(){
		return this.repo.getProductsInventoryEqualToZero();
	}
	
	public List<Product> findByProductMerchant(String productMerchant){
		return this.repo.findByProductMerchant(productMerchant);
	}
}
