package com.phearun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.phearun.model.User;
import com.phearun.service.UserService;

@SpringBootApplication
public class PrHibernateDemoApplication implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(PrHibernateDemoApplication.class, args);
	}

	@Autowired
	private UserService userService;
	
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		User user = new User("Phearun", "Male"); 
		userService.save(user);
		userService.getUsers().forEach(System.out::println);
	}
}
