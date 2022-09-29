package com.serviceofproduct.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serviceofproduct.entity.Product;
import com.serviceofproduct.services.ProductService;

import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
@RequestMapping(path = "/api/products")
@AllArgsConstructor
@Data
public class ProductController {
	
	private ProductService service;
	
	@GetMapping
	public List<Product> getAllproducts(){
		return this.service.findAll();
	}
	
	@GetMapping("/available")
	public List<Product> getProductsWithInventoryAvailable(){
		return this.service.getProductsInventoryGreaterThanZero();
	}
	
	@GetMapping("/not-available")
	public List<Product> getProductsWithInventoryNotAvailable(){
		return this.service.getProductsInventoryEqualToZero();
	}
	
	@PostMapping("/add")
	public ResponseEntity<Product> add(@RequestBody Product product) {
		Product newProduct = this.service.save(product);
		return ResponseEntity.ok().body(newProduct);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Product> update(@RequestBody Product product){
		Product newProduct = this.service.update(product);
		return ResponseEntity.ok().body(newProduct);
	}
	
	@PostMapping("/byMerchant")
	public List<Product> findByProductMerchant(@RequestBody String productMerchant) {
		return this.service.findByProductMerchant(productMerchant);
	}

	
}
