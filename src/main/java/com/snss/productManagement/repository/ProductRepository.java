package com.snss.productManagement.repository;

import java.time.LocalDate;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

	private Long productId;
	
	private String productName;
	
	private String productDescription;
	
	private LocalDate registrationDate;
	
	private String createdBy;
	
	private LocalDate createdDate;
	
    private String updatedBy;
	
	private LocalDate updatedDate;
	
}
