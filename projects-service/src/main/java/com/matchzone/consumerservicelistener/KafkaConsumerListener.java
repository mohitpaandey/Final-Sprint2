package com.matchzone.consumerservicelistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;


import com.matchzone.model.Project;
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


	@KafkaListener(topics = "proj_data",groupId="proj1_json", containerFactory="kafkaListenerContainerFactory")
	public void consumeJson(@Payload Project project)
	{
		
		receiver.consumeJson(project);
	}
}
	