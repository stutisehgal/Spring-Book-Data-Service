package com.trg.boot;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.CommandLineRunner;

@Service
public class DataTest implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception{
		
		RestTemplate template = new RestTemplate();
		try {
			String bookUrl = "http://localhost:8081/books/";
			Book b = template.getForObject(bookUrl+700, Book.class);
			System.out.println(b);
		}
		catch (RestClientResponseException ex){
			System.out.println(ex.getResponseBodyAsString());
		}
		
	}
}

