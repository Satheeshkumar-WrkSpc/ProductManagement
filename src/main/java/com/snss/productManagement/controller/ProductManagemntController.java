package com.snss.productManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snss.productManagement.entity.ProductEntity;
import com.snss.productManagement.service.ProductManagementService;

@RestController
@RequestMapping("/product")
public class ProductManagemntController {

	@Autowired
	private ProductManagementService productManagementService;
	
	@GetMapping("/list")
	public List<ProductEntity> productList() {
		return productManagementService.getAllProducts();
	}
	
	@PostMapping("/register")
	public String registerProduct() {
		
		return "Success";
	}
	
	@PostMapping("/update")
	public String editProduct() {
		
		return "Edit Product";
	}
	
	@PostMapping("/delete")
	public String deleteProduct() {
		
		return "Edit Product";
	}
}
