package com.gabrieldev.course.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.gabrieldev.course.services.exceptions.DatabaseException;
import com.gabrieldev.course.services.exceptions.ResourceNotFoundExceptions;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class RsourceExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundExceptions.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundExceptions e, HttpServletRequest request){
		String error = "ResourceNotFound";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> database(DatabaseException e, HttpServletRequest request){
		String error = "Database erroe";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);

	}
}
