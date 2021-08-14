package com.examly.springapp.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.BookModel;
import com.examly.springapp.repo.BookRepo;

@RestController
public class BookController {
	
	
	@Autowired
	BookRepo ProductRepo;
	
	//Welcome Message
	@GetMapping("/")
	public String returnWelcome() {
		return "REST Server Started :)";
	}
	
	//save a new product
	@PostMapping("/addbook")
	public void saveProduct(@RequestBody BookModel product) {
		ProductRepo.save(product);
	}
	
	//get all the products
	@GetMapping("/allbook")
	public List<BookModel> getAllProducts(){
		return (List<BookModel>) ProductRepo.findAll();
	}
	
	//get a single products
	@GetMapping("/book/{id}")
	public Optional<BookModel> getProduct(@PathVariable(value = "id") String id) {
		return ProductRepo.findById(id);
	}
}