package com.gabrieldev.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrieldev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
