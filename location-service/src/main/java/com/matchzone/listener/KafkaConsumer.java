package com.matchzone.listener;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);

	@KafkaListener(topics = "loc_data", groupId = "loc1_json", containerFactory="kafkaListenerContainerFactory")
	public void consume(String message) {
		LOG.info("Consumed message='{}'", message);
	}

}
