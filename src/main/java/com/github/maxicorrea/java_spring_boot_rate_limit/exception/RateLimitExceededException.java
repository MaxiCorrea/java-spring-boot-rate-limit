package com.github.maxicorrea.java_spring_boot_rate_limit.exception;

public class RateLimitExceededException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private static final String DEFAULT_MESSAGE = "Rate limit exceeded. Please try again later.";
	
	public RateLimitExceededException() {
		this(DEFAULT_MESSAGE);
	}
	
	public RateLimitExceededException(
			final String message) {
		super(message);
	}
	
}
