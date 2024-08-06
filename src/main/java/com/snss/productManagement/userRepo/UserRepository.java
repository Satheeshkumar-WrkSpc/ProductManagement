package com.snss.productManagement.userRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snss.productManagement.entity.userDataSource.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
