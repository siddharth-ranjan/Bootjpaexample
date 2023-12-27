package com.jpa.test.bootjpaexample;

import com.jpa.test.bootjpaexample.dao.UserRepository;
import com.jpa.test.bootjpaexample.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.Optional;
import java.util.function.Consumer;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

//		User user = new User();
//		user.setName("Xyz");
//		user.setCity("kljdk");
//		user.setStatus("jkcba");
//
//		User user1 = userRepository.save(user);


//		Optional<User> optionalUser = userRepository.findById(1);
//		User user = optionalUser.get();
//		user.setCity("Patna");
//		User user1 = userRepository.save(user);

		Iterable<User> itr = userRepository.findAll();
//		itr.forEach(new Consumer<User>() {
//			@Override
//			public void accept(User user) {
//				System.out.println(user.toString());
//			}
//		});

//		itr.forEach(user -> System.out.println(user));

		itr.forEach(System.out::println);

//		System.out.println("Done " + user1.toString());
	}

}
