package com.snss.productManagement.entity.productDataSource;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "products")
@NoArgsConstructor
@AllArgsConstructor
public class Product {

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
	
	public Long getProductId() {
		return this.productId;
	}
	
	public String getProductName() {
		return this.productName;
	}

	public String getProductDescription() {
		return this.productDescription;
	}

	public LocalDate getRegistrationDate() {
		return this.registrationDate;
	}
	
	public String getCreatedBy() {
		return this.createdBy;
	}

	public LocalDate getCreatedDate() {
		return this.createdDate;
	}
	
	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public LocalDate getUpdatedDate() {
		return this.updatedDate;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
	
}
