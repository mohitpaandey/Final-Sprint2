package com.matchzone.corenlp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages= {"com.matchzone"})
@EnableEurekaClient
public class CoreNlpApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreNlpApplication.class, args);
	}
}
