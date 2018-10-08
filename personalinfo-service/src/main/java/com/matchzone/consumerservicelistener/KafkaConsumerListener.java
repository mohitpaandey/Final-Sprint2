package com.matchzone.consumerservicelistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import com.matchzone.model.PersonalInfo;


@Service
public class KafkaConsumerListener 
{
	/*@Autowired
	// Write the name of Service Class for CertificationService
	private UserAuthenticationService userAuthenticationService;
	
	@KafkaListener(topics = "upstream_data")
	public void consumeJson(@Payload PersonalInfo personalinfo)
	{
		try 
		{
			userAuthenticationService.saveUser(personalinfo);
		} catch (UserAlreadyExistsException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}
