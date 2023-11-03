package com.gabrieldev.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrieldev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
