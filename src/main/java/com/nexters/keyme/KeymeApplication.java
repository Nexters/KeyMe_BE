package com.nexters.keyme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class KeymeApplication {
	public static void main(String[] args) {
		SpringApplication.run(KeymeApplication.class, args);
	}
}
