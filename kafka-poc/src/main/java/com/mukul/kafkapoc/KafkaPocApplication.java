package com.mukul.kafkapoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaPocApplication.class, args);
	}
	
	@KafkaListener(topics = "test-topic", groupId = "consumerGroup")
	public void listen(String message) {
	    System.out.println("Received Messasge in group foo: " + message);
	}

}
