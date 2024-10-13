package com.devskills.springdata.models;

//import org.hibernate.annotations.Polymorphism;
//import org.hibernate.annotations.PolymorphismType;

import jakarta.persistence.Entity;
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
//@PrimaryKeyJoinColumn(name = "video_id")
// @DiscriminatorValue("V")
//@Polymorphism(type = PolymorphismType.EXPLICIT)
public class Video extends Resource {
	
	private int length;

}
