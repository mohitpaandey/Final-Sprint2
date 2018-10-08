package com.matchzone.consumerservicelistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.matchzone.exception.UserAlreadyExistsException;
import com.matchzone.model.User;
import com.matchzone.service.UserAuthenticationService;

@Service
public class KafkaConsumerListener 
{
	@Autowired
	private UserAuthenticationService userAuthenticationService;
	
	@KafkaListener(topics = "register_data")
	public void consumeJson(@Payload User user)
	{
		try 
		{
			userAuthenticationService.saveUser(user);
		} catch (UserAlreadyExistsException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
