package com.matchzone.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matchzone.exception.UserAlreadyExistsException;
import com.matchzone.exception.UserIdAndPasswordMismatchException;
import com.matchzone.exception.UserNotFoundException;
import com.matchzone.model.User;
import com.matchzone.repository.UserAuthenticationRepository;
import com.matchzone.security.SecurityTokenGenerator;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class UserAuthenticationServiceImpl implements UserAuthenticationService {

    @Autowired
    private UserAuthenticationRepository authenticationRepository;

    @Override
    public Map<String,String> generateToken(String emailId, String password) throws UserNotFoundException,UserIdAndPasswordMismatchException {
        Map<String,String> map=new HashMap<>();
        User user = authenticationRepository.findByUserEmailAndUserPassword(emailId, password);
        if (user == null) {
            throw new UserNotFoundException("User not found");
        }
        else if (!password.equals(user.getUserPassword())) {
            throw new UserIdAndPasswordMismatchException(
                    "Invalid login credentials, Please check emailId and password ");
        }
        else {
            SecurityTokenGenerator securityTokenGenrator = (User userDetails) -> {
                String jwtToken = "";
                jwtToken = Jwts.builder()
                        .setId(user.getUserEmail())
                        .claim("name",user.getUserName())
                        .setSubject(user.getUserRole())
                        .setIssuedAt(new Date())
                        .signWith(SignatureAlgorithm.HS256, "secretkey")
                        .compact();
                Map<String, String> map1 = new HashMap<>();
                map1.put("token", jwtToken);
                map1.put("message", "User successfully logged in");
                return map1;
            };
            map=securityTokenGenrator.generateToken(user);
            
        }
        return map;
    }

    @Override
    public boolean saveUser(User user) throws UserAlreadyExistsException {
        Optional<User> fetchedUser = authenticationRepository.findById(user.getUserEmail());
        if (fetchedUser.isPresent()) {
            throw new UserAlreadyExistsException("User with EmailId already exists");
        }
        authenticationRepository.save(user);
        return true;
    }

}
