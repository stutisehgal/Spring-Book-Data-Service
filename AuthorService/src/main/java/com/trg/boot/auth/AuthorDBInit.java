package com.trg.boot.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.trg.boot.auth.entity.Author;
import com.trg.boot.auth.repo.AuthorRepository;

@Service
public class AuthorDBInit implements CommandLineRunner{

	@Autowired
	AuthorRepository repo;
	
	Logger logger = LoggerFactory.getLogger(AuthorDBInit.class);

	@Override
	public void run(String... args) throws Exception{
		
		logger.info("Adding data to Book table");
		
		repo.save(new Author(111,"JK Rowling","Science",81305125));
		repo.save(new Author(222,"DK Menon","Coding",98766272));
		repo.save(new Author(333,"Nitish Sharma","Database",1234557));
		repo.save(new Author(444,"RK Dhoda","Micro",222222));
		repo.save(new Author(555,"Ansal Neeru","Web",4545666));
		repo.save(new Author(666,"Chand Prem","Java",6789012));
		
		logger.info("6 Authors added");
	}
	
}
