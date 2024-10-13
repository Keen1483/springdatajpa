package com.devskills.springdata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devskills.springdata.models.Video;

public interface VideoRepository extends JpaRepository<Video, Integer> {

}
