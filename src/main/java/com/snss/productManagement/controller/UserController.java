package com.snss.productManagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snss.productManagement.entity.userDataSource.User;


@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/list")
	public List<User> productList() {
		return null;
	}
	
	@PostMapping("/register")
	public User registerProduct(@RequestBody User user) {
		
		System.out.println("Register user triggered :: ");
		return null;
	}
}
