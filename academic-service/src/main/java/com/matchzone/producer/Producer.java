package com.matchzone.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.matchzone.model.AcademicDetails;

@Service
public class Producer {
	@Autowired
	private KafkaTemplate<String,AcademicDetails> kafkaTemplate;

	public void sendtoindexer(AcademicDetails academicIndexer) {

		kafkaTemplate.send("acad1_data",academicIndexer);
	}

}