package com.gabrieldev.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrieldev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
