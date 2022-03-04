package com.trg.boot.book.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trg.boot.book.entity.Book;
import com.trg.boot.book.repo.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookRepository repo;
	
	@RequestMapping("{bid}")
	public ResponseEntity<?> getBook(@PathVariable int bid){
		
		Optional<Book> opt = repo.findById(bid);
		if(opt.isPresent()) {
			return new ResponseEntity<Book>(opt.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Book not found",HttpStatus.BAD_REQUEST);
		}
		
	}
}
