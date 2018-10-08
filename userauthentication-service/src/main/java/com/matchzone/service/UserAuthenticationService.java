package com.matchzone.service;

import java.util.Map;

import com.matchzone.exception.UserAlreadyExistsException;
import com.matchzone.exception.UserIdAndPasswordMismatchException;
import com.matchzone.exception.UserNotFoundException;
import com.matchzone.model.User;

public interface UserAuthenticationService {

    public Map<String,String> generateToken(String emailId, String password) throws UserNotFoundException,UserIdAndPasswordMismatchException;

    boolean saveUser(User user) throws UserAlreadyExistsException;

}
