package com.snss.productManagement.productRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snss.productManagement.entity.productDataSource.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}
