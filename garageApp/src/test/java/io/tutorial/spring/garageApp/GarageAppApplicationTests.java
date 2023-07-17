package io.tutorial.spring.garageApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class GarageAppApplicationTests {

	@Autowired
	private GarageAppApplication garageAppApplication;

	@Test
	void contextLoads() {
		assertThat(garageAppApplication).isNotNull();
	}

}
