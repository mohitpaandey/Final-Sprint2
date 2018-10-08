package com.matchzone.test.service;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;




import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.matchzone.exception.UserAlreadyExistsException;
import com.matchzone.exception.UserNotFoundException;
import com.matchzone.model.User;
import com.matchzone.repository.UserAuthenticationRepository;
import com.matchzone.service.UserAuthenticationServiceImpl;



public class UserAuthenticationServiceImplTest
{

       @Mock
      private UserAuthenticationRepository userRepository;
      private User user;

       @InjectMocks
       private UserAuthenticationServiceImpl authenticateService;

       @MockBean
       private UserAuthenticationRepository authenticateRepository;


       @Before
       public void setUp() {
           MockitoAnnotations.initMocks(this);

           user = new User();
           user.setUserEmail("Johan@gmail.com");
           user.setUserPassword("johnpass");
           user.setUserRole("employee");


       }

       @Test
       public void registerUserSuccess() throws UserAlreadyExistsException {
           when(userRepository.save((User) any())).thenReturn(user);
           boolean userSaved = authenticateService.saveUser(user);
           assertEquals(true, userSaved);

       }

       public void registerUserFailure() throws UserAlreadyExistsException{
           when(userRepository.save((User) any())).thenReturn(null);
           boolean userSaved = authenticateService.saveUser(user);
           assertEquals(false, userSaved);

       }


       @Test
       public void getUserByIdAndpassword() throws UserNotFoundException,UserAlreadyExistsException {

           when(userRepository.findByUserEmailAndUserPassword("Johan@gmail.com","johnpass")).thenReturn(user);
           boolean userSaved = authenticateService.saveUser(user);

           assertEquals(true, userSaved);

       }

}
