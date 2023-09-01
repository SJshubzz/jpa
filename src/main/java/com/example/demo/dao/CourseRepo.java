package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {
	

}
