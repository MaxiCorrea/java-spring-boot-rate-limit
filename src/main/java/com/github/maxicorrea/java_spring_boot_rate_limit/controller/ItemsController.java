package com.github.maxicorrea.java_spring_boot_rate_limit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.maxicorrea.java_spring_boot_rate_limit.service.ItemService;

@RestController
@RequestMapping("/api/v1/items")
public class ItemsController {

	private final ItemService itemService;
	
	public ItemsController(
			final ItemService itemService) {
		this.itemService = itemService;
	}
	
	@GetMapping
	public ResponseEntity<?> getItems() {
		return ResponseEntity.ok(itemService.getAll());
	}
	
}
