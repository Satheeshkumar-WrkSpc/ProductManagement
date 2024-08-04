package com.snss.productManagement.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	
	private String productName;
	
	private String productDescription;
	
	private LocalDate registrationDate;
	
	private String createdBy;
	
	private LocalDate createdDate;
	
    private String updatedBy;
	
	private LocalDate updatedDate;
}
