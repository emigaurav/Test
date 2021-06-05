package com.example.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {
	private static final Logger log = LoggerFactory.getLogger(TestApplication.class);
	public static void main(String[] args) {
		log.info("My first App");
		SpringApplication.run(TestApplication.class, args);

		log.info("My first App Running..");
	}

}
