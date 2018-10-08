package com.matchzone.service.test;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Optional;

import com.matchzone.exceptions.UserNotFoundException;
import com.matchzone.service.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.matchzone.exceptions.UserAlreadyExistsException;
import com.matchzone.model.User;
import com.matchzone.repository.UserRepository;

public class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;


    private User user;

    @InjectMocks
    private UserServiceImpl userService;

    private Optional<User> options;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        user = new User();
        user.setUserEmail("jhonsimon@gmail.com");
        user.setUserName("john");
        user.setUserPassword("johnpass");

        options = Optional.of(user);

    }

    @Test
    public void registerUserSuccess() throws UserAlreadyExistsException {
        when(userRepository.insert((User) any())).thenReturn(user);
        boolean userSaved = userService.createUser(user);
        assertEquals(true, userSaved);

    }

    @Test(expected = UserAlreadyExistsException.class)
    public void registerUserFailure() throws UserAlreadyExistsException {
        when(userRepository.insert((User) any())).thenReturn(null);
        boolean userSaved = userService.createUser(user);
        assertEquals(user, userSaved);

    }

    @Test
    public void updateUser() throws UserNotFoundException {
        when(userRepository.findById(user.getUserEmail())).thenReturn(options);
        User fetchuser = userService.updateUser(user.getUserEmail(), user);
        assertEquals(user, fetchuser);

    }

    @Test
    public void deleteUserSuccess() throws UserNotFoundException {
        when(userRepository.findById(user.getUserEmail())).thenReturn(options);
        boolean flag = userService.deleteUser(user.getUserEmail());
        assertEquals(true, flag);

    }

    @Test
    public void getUserById() throws UserNotFoundException {

        when(userRepository.findById(user.getUserEmail())).thenReturn(options);

        User fetchedUser = userService.getUser(user.getUserEmail());

        assertEquals(user, fetchedUser);

    }



}