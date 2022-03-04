package com.trg.boot.auth.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.trg.boot.auth.entity.Author;
import com.trg.boot.auth.repo.AuthorRepository;

@RestController
@RequestMapping("/auth")
public class AuthorController {

	@Autowired
	AuthorRepository repo;
	
	@RequestMapping("{aid}")
	public ResponseEntity<?> getPublisher(@PathVariable int aid){
		
		Optional<Author> opt = repo.findById(aid);
		if(opt.isPresent()) {
			return new ResponseEntity<Author>(opt.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Author not found",HttpStatus.BAD_REQUEST);
		}
		
	}
}
