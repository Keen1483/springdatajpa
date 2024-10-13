package com.devskills.springdata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.devskills.springdata.models.Video;
import com.devskills.springdata.repositories.AuthorRepository;
import com.devskills.springdata.repositories.VideoRepository;

@SpringBootApplication
public class SpringdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdataApplication.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunner(
			AuthorRepository authorRepository,
			VideoRepository videoRepository
	) {
		return args -> {
			/*var author = Author.builder()
			.firstName("Jim")
			.lastName("Karter")
			.age(34)
			.email("jim@mail.com")
			.build();
			
			authorRepository.save(author);*/
			
			var video = Video.builder()
					.name("abc")
					.length(5)
					.build();
			videoRepository.save(video);
		};
	}

}
