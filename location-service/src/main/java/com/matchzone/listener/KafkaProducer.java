package com.matchzone.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matchzone.model.Location;

@RestController
@RequestMapping("kafka")
public class KafkaProducer {


	@Autowired
	private KafkaTemplate<String, Location> kafkaTemplateskill;


	//@Value("${listener.topic.name}")
	private String TOPIC="loc_data";

	@GetMapping("/publish/{name}")
	public String postskill(@PathVariable("name") final String name) {


		kafkaTemplateskill.send(TOPIC, new Location(name, name, name,name));

		return "Published successfully";
	}
}
