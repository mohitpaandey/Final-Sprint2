package com.matchzone.service;

import com.matchzone.exceptions.UserAlreadyExistsException;
import com.matchzone.exceptions.UserNotFoundException;
import com.matchzone.model.User;

public interface UserService {

	boolean createUser(User user) throws UserAlreadyExistsException;
	
	boolean deleteUser(String userId) throws UserNotFoundException;
	
	User updateUser(String userId, User user) throws UserNotFoundException;
	
	User getUser(String userId) throws UserNotFoundException;
	
}
