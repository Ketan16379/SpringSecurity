package com.example.SpringSecurityApp.SpringApplication;

import com.example.SpringSecurityApp.SpringApplication.entities.User;
import com.example.SpringSecurityApp.SpringApplication.services.JwtService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSecurityAppApplicationTests {

	@Autowired
	private JwtService jwtService;

	@Test
	void contextLoads(){

		User user = new User(1L, "ketan@gmail.com", "1234");

		String token = jwtService.generateToken(user);

		System.out.println(token);

		Long id = jwtService.getUserIdFromToken(token);

		System.out.println(id);
	}
}
