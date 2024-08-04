package com.snss.productManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snss.productManagement.entity.Product;
import com.snss.productManagement.repository.ProductRepository;

@Service
public class ProductManagementService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {

		return productRepository.findAll();
	}

	public Product saveUser(Product productEntity) {
		
		return productRepository.save(productEntity);
	}
}
