package com.devskills.springdata.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.devskills.springdata.models.Author;

import jakarta.transaction.Transactional;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
	
	// JPA QUERY METHODS
	
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
	
	// JPA NAMED QUERIES
	
	// update author a set a.age = 22 where a.id = 1
	@Modifying
	@Transactional
	@Query("update Author a set a.age = :age where a.id = :id")
	int updateAuthor(int age, int id);
	
	// update author a set a.age = 95
	@Modifying
	@Transactional
	@Query("update Author a set a.age = :age")
	void updateAllAuthorAges(int age);
	
	List<Author> findByNamedQuery(@Param("age") int age);
	
	@Modifying
	@Transactional
	void updateByNamedQuery(@Param("age") int age);

}
