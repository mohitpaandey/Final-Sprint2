package com.matchzone.indexer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.matchzone.model.Location;
import com.matchzone.listener.KafkaConsumer;




@RestController
public class IndexerOutput {
	@Autowired
	private KafkaTemplate<String, Index> kafkaTemplate;

	private String topic = "loc_data";

	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);

	@KafkaListener(topics = "loc_data", groupId = "loc_json", containerFactory = "kafkaListenerContainerFactory")
	public void consumeJson(Location location) {

		kafkaTemplate.send(topic,
				new Index(location.getCity(),location.getCountry(),location.getState(),location.getUserName()));
		LOG.info("Produced JSON message on indexer='{}'");

	}

}