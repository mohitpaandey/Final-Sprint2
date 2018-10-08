package com.matchzone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matchzone.model.User;

@Repository
public interface UserAuthenticationRepository extends JpaRepository<User, String> 
{
	
	User findByUserEmailAndUserPassword(String userEmail, String userPassword);
}
