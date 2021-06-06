package com.example.Test;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {
	private final Logger logger= LoggerFactory.getLogger(this.getClass());

	@Test
	void contextLoads() {
		logger.info("In Test Class.....");

	}

}
