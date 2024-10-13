package com.devskills.springdata.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devskills.springdata.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
	
	// select * from author where first_name = 'bill'
	List<Author> findAllByFirstName(String fn);
	
	// select * from author where first_name = 'ill'
	List<Author> findAllByFirstNameIgnoreCase(String fn);
	
	// select * from author where first_name like '%ill%'
	List<Author> findAllByFirstNameContainingIgnoreCase(String fn);
	
	// select * from author where first_name like 'ill%'
	List<Author> findAllByFirstNameStartsWithIgnoreCase(String fn);
	
	// select * from author where first_name like '%ill'
	List<Author> findAllByFirstNameEndsWithIgnoreCase(String fn);
	
	// select * from author where first_name in ('bill', 'brave', 'john', 'rock')
	List<Author> findAllByFirstNameInIgnoreCase(String... firstNames);
	
	int countAllByAge(int age);

}
