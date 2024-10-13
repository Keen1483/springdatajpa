package com.devskills.springdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdataApplication.class, args);
	}
	
	/*@Bean
	CommandLineRunner commandLineRunner(
			AuthorRepository repository
	) {
		return args -> {
			var author = Author.builder()
			.firstName("Jim")
			.lastName("Karter")
			.age(34)
			.email("jim@mail.com")
			.build();
			
			repository.save(author);
		};
	}*/

}
