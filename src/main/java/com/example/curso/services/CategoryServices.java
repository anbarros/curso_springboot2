package com.example.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curso.entity.Category;
import com.example.curso.entity.Order;
import com.example.curso.repositories.CategoryRepository;

@Service
public class CategoryServices {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long Id) {
		Optional<Category> obj = repository.findById(Id);
		return obj.get();
	}
}
