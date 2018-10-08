package com.matchzone.test.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.matchzone.controller.UserAuthenticationController;
import com.matchzone.exception.UserAlreadyExistsException;
import com.matchzone.exception.UserIdAndPasswordMismatchException;
import com.matchzone.model.User;
import com.matchzone.repository.UserAuthenticationRepository;
import com.matchzone.service.UserAuthenticationService;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.ArgumentMatchers.any;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;

import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.test.web.servlet.MockMvc;



import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@WebMvcTest(UserAuthenticationController.class)

public class UserAuthenticationControllerTest
{
        @Autowired
        private MockMvc mockMvc;
        
        
        @MockBean
        private User user;
        
        @MockBean
        private UserAuthenticationService authenticateService;
        @MockBean
        private UserAuthenticationRepository authenticateRepository;
        
        @InjectMocks
        private UserAuthenticationController authenticateController;
        
        @Before
        public void setUp() {
            MockitoAnnotations.initMocks(this);
            mockMvc = MockMvcBuilders.standaloneSetup(authenticateController).build();
            user = new User();
            user.setUserEmail("Johan@gmail.com");
            user.setUserPassword("1234");
            user.setUserRole("employee");
        }

        @Test
        public void registerUserSuccess() throws UserAlreadyExistsException {
        	
            when(authenticateService.saveUser(user)).thenReturn(true);
            try {
				mockMvc.perform(post("/api/v1/auth/register")
				        .contentType(MediaType.APPLICATION_JSON).content(jsonToString(user)))
				        .andExpect(status().isCreated()).andDo(print());
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }

        @Test
        public void registerUserFailure() throws UserAlreadyExistsException {

            when(authenticateService.saveUser(any())).thenThrow(UserAlreadyExistsException.class);
            try {
				mockMvc.perform(post("/api/v1/auth/register")
				        .contentType(MediaType.APPLICATION_JSON).content(jsonToString(user)))
				        .andExpect(status().isConflict()).andDo(print());
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }


        @Test
        public void testLoginUser() throws UserIdAndPasswordMismatchException, UserAlreadyExistsException {
            String emailId = "Johan@gmail.com";
            String password = "1234";
            when(authenticateService.saveUser(user)).thenReturn(true);
            when(authenticateRepository.findByUserEmailAndUserPassword(emailId, password)).thenReturn(user);
            try {
				mockMvc.perform(post("/api/login").contentType(MediaType.APPLICATION_JSON).content(jsonToString(user)))
				        .andExpect(status().isOk()).andDo(print());
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        // Parsing String format data into JSON format
        private static String jsonToString(final Object obj) throws JsonProcessingException {
            String result;
            try {
                final ObjectMapper mapper = new ObjectMapper();
                final String jsonContent = mapper.writeValueAsString(obj);
                result = jsonContent;
            } catch (JsonProcessingException e) {
                result = "Json processing error";
            }
            return result;
        }
     }
