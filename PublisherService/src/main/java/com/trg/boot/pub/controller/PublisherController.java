package com.trg.boot.pub.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.trg.boot.pub.entity.Publisher;
import com.trg.boot.pub.repo.PublisherRepository;

@RestController
@RequestMapping("/pub")
public class PublisherController {

	@Autowired
	PublisherRepository repo;
	
	@RequestMapping("{pid}")
	public ResponseEntity<?> getPublisher(@PathVariable int pid){
		
		Optional<Publisher> opt = repo.findById(pid);
		if(opt.isPresent()) {
			return new ResponseEntity<Publisher>(opt.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Publisher not found",HttpStatus.BAD_REQUEST);
		}
		
	}
}
