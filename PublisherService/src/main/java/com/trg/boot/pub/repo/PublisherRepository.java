package com.trg.boot.pub.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.trg.boot.pub.entity.Publisher;

@Component
public interface PublisherRepository extends JpaRepository<Publisher,Integer> {

	
}
