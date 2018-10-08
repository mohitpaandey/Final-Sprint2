package com.matchzone.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


import com.matchzone.model.Certification;

@Service
public class Producer {
	@Autowired
	private KafkaTemplate<String,Certification> kafkaTemplate;

	public void sendtoindexer(Certification certification) {

		kafkaTemplate.send("certi1_data",certification);
	}

}