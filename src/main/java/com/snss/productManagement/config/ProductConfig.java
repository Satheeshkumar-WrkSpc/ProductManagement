package com.snss.productManagement.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.snss.productManagement.repository")
@EntityScan(basePackages = "com.snss.productManagement.entity")
@Configuration
public class ProductConfig {

	
}
