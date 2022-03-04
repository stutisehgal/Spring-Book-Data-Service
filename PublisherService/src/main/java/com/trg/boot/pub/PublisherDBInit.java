package com.trg.boot.pub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.trg.boot.pub.entity.Publisher;
import com.trg.boot.pub.repo.PublisherRepository;

@Service
public class PublisherDBInit implements CommandLineRunner{

	@Autowired
	PublisherRepository repo;
	
	Logger logger = LoggerFactory.getLogger(PublisherDBInit.class);

	@Override
	public void run(String... args) throws Exception{
		
		logger.info("Adding data to Book table");
		
		repo.save(new Publisher(11,"JK Publications","Pumpkin Street"));
		repo.save(new Publisher(22,"Menon Publications","Oxford Street"));
		repo.save(new Publisher(33,"Sharma Publications","Burkshire Street"));
		repo.save(new Publisher(44,"Dhoda Publications","Delhi Street"));
		repo.save(new Publisher(55,"Neeru Publications","Nathu La"));
		repo.save(new Publisher(66,"Prem Publications","Borkos Street"));
		
		logger.info("6 Publishers added");
	}
	
}
