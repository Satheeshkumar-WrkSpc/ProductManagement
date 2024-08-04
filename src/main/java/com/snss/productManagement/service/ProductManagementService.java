package com.snss.productManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snss.productManagement.entity.ProductEntity;
import com.snss.productManagement.repository.ProductRepository;

@Service
public class ProductManagementService {

	@Autowired
	private ProductRepository productRepository;

	public List<ProductEntity> getAllProducts() {

		return productRepository.findAll();
	}

	public ProductEntity saveUser(ProductEntity productEntity) {
		
		return productRepository.save(productEntity);
	}
}
