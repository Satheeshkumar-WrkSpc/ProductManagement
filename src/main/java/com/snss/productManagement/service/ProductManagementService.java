package com.snss.productManagement.service;

import java.util.List;

import com.snss.productManagement.entity.productDataSource.Product;

public interface ProductManagementService {

	public List<Product> getAllProducts();
	
	public Product saveProduct(Product product);
	
	public Product updateProduct(Product product);
	
	public void deleteProduct(Product product);
}
