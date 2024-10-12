package com.devskills.springdata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devskills.springdata.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
