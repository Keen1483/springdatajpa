package com.devskills.springdata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.Specification;

import com.devskills.springdata.models.Author;
import com.devskills.springdata.repositories.AuthorRepository;
import com.devskills.springdata.repositories.VideoRepository;
import com.devskills.springdata.specification.AuthorSpecification;
//import com.github.javafaker.Faker;

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
			/*for (int i = 0; i < 50; i++) {
				Faker faker = new Faker();
				var author = Author.builder()
				.firstName(faker.name().firstName())
				.lastName(faker.name().lastName())
				.age(faker.number().numberBetween(20, 80))
				.email(faker.name().username() + "@mail.com")
				.build();
				
				authorRepository.save(author);
			}*/
			
			/*var author = Author.builder()
					.id(1)
					.firstName("Dongmo")
					.lastName("Geraud")
					.age(34)
					.email("dongmo@mail.com")
					.build();
			authorRepository.save(author);*/
			
			/*var video = Video.builder()
					.name("abc")
					.length(5)
					.build();
			videoRepository.save(video);*/
			
			// var authors = authorRepository.findAllByFirstNameInIgnoreCase(new String[]{"ja", "ranee", "landon", "luther"});
			
			// update author a set a.age = 22 where a.id = 1
			//authorRepository.updateAuthor(90, 50);
			
			// update author a set a.age = 95
			//authorRepository.updateAllAuthorAges(95);
			
			// find by named query
			/*authorRepository.findByNamedQuery(96)
				.forEach(System.out::println);*/
			
			// update by named query
			//authorRepository.updateByNamedQuery(22);
			
			Specification<Author> spec = Specification
					.where(AuthorSpecification.hasAge(22))
					.or(AuthorSpecification.firstNameLike("ris"))
					.and(AuthorSpecification.firstNameLike("a"))
					;
			authorRepository.findAll(spec)
				.forEach(System.out::println);
		};
	}

}
