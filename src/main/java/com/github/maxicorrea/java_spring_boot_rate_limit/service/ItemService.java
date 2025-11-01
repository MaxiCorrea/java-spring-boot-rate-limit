package com.github.maxicorrea.java_spring_boot_rate_limit.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ItemService {

	public Iterable<String> getAll() {
		return List.of("ITEM1","ITEM2","ITEM3");
	}
	
}
