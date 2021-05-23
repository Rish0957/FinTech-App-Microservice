package com.rishabh.securityapp;

import com.rishabh.securityapp.user.model.User;
import com.rishabh.securityapp.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthenticationServiceApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("Rishabh","Khandelwal"));
		userRepository.save(new User("Rahul","Agrawal"));
		userRepository.save(new User("Gaurav","Patidar"));
		userRepository.save(new User("Munendra","Dhayal"));
		userRepository.save(new User("Lekhu","Kumawat"));
	}
}
