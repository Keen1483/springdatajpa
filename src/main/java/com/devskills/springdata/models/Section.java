package com.devskills.springdata.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Section extends BaseEntity {
	
	private String name;
	
	private int sectionOrder;
	
	@ManyToOne
	@JoinColumn(
			name = "course_id"
	)
	private Course course;
	
	@OneToMany(
			mappedBy = "section"
	)
	private List<Lecture> lectures;

}
