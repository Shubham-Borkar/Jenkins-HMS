package com.hms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hms.service.ResourceService;

@SpringBootTest
class HmsApplicationTests {
	@Autowired
	private ResourceService resSer;

	@Test
	void contextLoads() {
		assertEquals(6,resSer.resourceList().size(),"Correct Count");
	}

}
