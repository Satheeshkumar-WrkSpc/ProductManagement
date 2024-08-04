package com.snss.productManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductManagemntController {

	@GetMapping("/List")
	public String productList() {
		
		return "List of products";
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
