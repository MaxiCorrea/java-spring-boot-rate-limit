package com.github.maxicorrea.java_spring_boot_rate_limit.exception;

import static org.springframework.http.HttpStatus.TOO_MANY_REQUESTS;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(RateLimitExceededException.class)
	public ResponseEntity<Map<String, Object>> handleRateLimitExceeded(
			final RateLimitExceededException ex) {
		Map<String, Object> body = new HashMap<>();
		body.put("status", TOO_MANY_REQUESTS.value());
		body.put("error", "Too Many Requests");
		body.put("message", ex.getMessage());
		return ResponseEntity.status(TOO_MANY_REQUESTS).body(body);
	}
	
}