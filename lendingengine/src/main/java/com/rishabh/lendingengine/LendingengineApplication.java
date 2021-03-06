package com.rishabh.lendingengine;

import com.rishabh.lendingengine.domain.model.Balance;
import com.rishabh.lendingengine.domain.model.User;
import com.rishabh.lendingengine.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LendingengineApplication {
	@Autowired
	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(LendingengineApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		userRepository.save(new User("Rishabh","Rishabh","Khandelwal",25,"Software Developer",new Balance() ));
//		userRepository.save(new User("Rahul","Rahul","Agrawal",26,"Software Developer", new Balance()));
//		userRepository.save(new User("Gaurav","Gaurav","Patidar",25,"Software Developer", new Balance()));
//		userRepository.save(new User("Munendra","Munendra","Dhayal",23,"Business", new Balance()));
//		userRepository.save(new User("Lekhu","Lekhu","Kumawat",25,"Unemployed", new Balance()));
//
//	}
}
