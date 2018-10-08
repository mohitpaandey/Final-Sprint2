package com.matchzone.consumerservicelistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;



import com.matchzone.model.Skills;
import com.matchzone.producer.Receiver;


@Service
public class KafkaConsumerListener 
{
	
	// Write the name of Service Class for AcademicService
	private Receiver receiver;
	
	@Autowired
	public KafkaConsumerListener(Receiver receiver) {
		this.receiver=receiver;
	}


	@KafkaListener(topics = "skill_data",groupId="skill1_json")
	public void consumeJson(@Payload Skills skill)
	{
		
		receiver.consumeJson(skill);
	}
}
	