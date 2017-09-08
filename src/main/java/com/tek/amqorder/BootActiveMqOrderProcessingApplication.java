package com.tek.amqorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class BootActiveMqOrderProcessingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootActiveMqOrderProcessingApplication.class, args);
	}
}
