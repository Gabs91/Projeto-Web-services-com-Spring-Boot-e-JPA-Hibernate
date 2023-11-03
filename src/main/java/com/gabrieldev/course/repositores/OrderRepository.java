package com.gabrieldev.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrieldev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
