package com.snss.productManagement.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snss.productManagement.entity.productDataSource.Product;
import com.snss.productManagement.repository.ProductRepository;

@Service
public class ProductManagementServiceImpl implements  ProductManagementService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {

		return productRepository.findAll();
	}

	public Product saveProduct(Product product) {

		product.setCreatedDate(LocalDate.now());
		product.setUpdatedBy(product.getCreatedBy());
		product.setUpdatedDate(LocalDate.now());
		return productRepository.save(product);
	}

	public Product updateProduct(Product product) {

		product.setUpdatedBy("satheesh.s@gmail.com");
		product.setUpdatedDate(LocalDate.now());
		return productRepository.save(product);
	}

	public void deleteProduct(Product product) {
		
		productRepository.delete(product);
	}
	
}
