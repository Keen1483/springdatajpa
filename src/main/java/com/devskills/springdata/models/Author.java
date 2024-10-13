package com.devskills.springdata.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Author extends BaseEntity {
	
	private String firstName;
	
	private String lastName;
	
	@Column(
			unique = true,
			nullable = false
	)
	private String email;
	
	private int age;
	
	@ManyToMany(
			mappedBy = "authors",
			fetch = FetchType.EAGER
	)
	private List<Course> courses;

}
