package com.snss.productManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snss.productManagement.entity.productDataSource.Product;
import com.snss.productManagement.service.ProductManagementService;

@RestController
@RequestMapping("/product")
public class ProductManagemntController {

	@Autowired
	private ProductManagementService productManagementService;
	
	@GetMapping("/list")
	public List<Product> productList() {
		return productManagementService.getAllProducts();
	}
	
	@PostMapping("/register")
	public Product registerProduct(@RequestBody Product product) {
		
		System.out.println("Register product :: " + product.getProductName());
		return productManagementService.saveProduct(product);
	}
	
	@PostMapping("/update")
	public Product editProduct(@RequestBody Product product) {
		
		System.out.println("Update request reached the controller");
		return productManagementService.updateProduct(product);
	}
	
	@PostMapping("/delete/{productId}")
	public String deleteProduct(@PathVariable Long productId) {
		
		System.out.println("Delete request reached the controller" + productId);
		return "Product deleted successfully";
	}
	
}
