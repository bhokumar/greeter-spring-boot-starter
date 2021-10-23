package com.github.bhokumar.starter;

import com.github.bhokumar.greeter.Greeter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class GreeterSpringBootStarterApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void contextLoads() {
	}


	@Test
	void greet() {
		Greeter greeter = applicationContext.getBean(Greeter.class);
		System.out.println(greeter.greet());
	}

}
