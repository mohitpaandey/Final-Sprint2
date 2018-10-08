package com.matchzone.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.matchzone.model.Project;

@Service
public class Producer {
	@Autowired
	private KafkaTemplate<String,Project> kafkaTemplate;

	public void sendtoindexer(Project project) {

		kafkaTemplate.send("proj1_data",project);
	}

}