package com.trg.boot.auth.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.trg.boot.auth.entity.Author;

@Component
public interface AuthorRepository extends JpaRepository<Author,Integer>{
	

}
