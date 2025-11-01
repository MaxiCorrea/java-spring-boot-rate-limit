package com.github.maxicorrea.java_spring_boot_rate_limit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.maxicorrea.java_spring_boot_rate_limit.exception.RateLimitExceededException;

import io.github.resilience4j.ratelimiter.RequestNotPermitted;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

@Service
public class ItemService {

	@RateLimiter(name = "apiRateLimiter", fallbackMethod = "rateLimitFallback")
	public Iterable<String> getAll() {
		return List.of("ITEM1","ITEM2","ITEM3");
	}
	
	Iterable<String> rateLimitFallback(
			final RequestNotPermitted ex) {
		throw new RateLimitExceededException();
	}

}
