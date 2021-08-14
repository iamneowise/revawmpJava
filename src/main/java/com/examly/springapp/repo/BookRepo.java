package com.examly.springapp.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.BookModel;

@Repository
public interface BookRepo extends CrudRepository<BookModel, String>{
	
}
