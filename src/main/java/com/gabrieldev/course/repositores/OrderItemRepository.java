package com.gabrieldev.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrieldev.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
