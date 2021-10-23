package com.github.bhokumar.starter;

import com.github.bhokumar.greeter.Greeter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.github.bhokumar", "com.github.bhokumar.greeter"})
public class GreeterSpringBootStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreeterSpringBootStarterApplication.class, args);
	}

}
