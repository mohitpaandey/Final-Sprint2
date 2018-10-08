package com.matchzone.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.matchzone.model.Skills;

@Service
public class Producer {
	@Autowired
	private KafkaTemplate<String,Skills> kafkaTemplate;

	public void sendtoindexer(Skills skills) {

		kafkaTemplate.send("skill1_data",skills);
	}

}