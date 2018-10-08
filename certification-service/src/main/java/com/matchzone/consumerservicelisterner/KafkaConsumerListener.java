package com.matchzone.consumerservicelisterner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;


import com.matchzone.model.Certification;
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


	@KafkaListener(topics = "certi_data", groupId="certi1_json", containerFactory="kafkaListenerContainerFactory")
	public void consumeJson(@Payload Certification certification)
	{
		
		receiver.consumeJson(certification);
	}
}
	