package com.trg.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BookDataController {

	@GetMapping("/bookdata/{bookId}")
	public BookData getBookData(@PathVariable int bookId) {
		
		String bookUrl = "http://localhost:8081/books";
		String pubUrl = "http://localhost:8082/pub/";
		String authUrl = "http://localhost:8083/auth/";
		
		RestTemplate template = new RestTemplate();
		Book book = template.getForObject(bookUrl+bookId, Book.class);
		
		int authorId = book.getAuthorId();
		int publisherId = book.getPublisherId();
		
		Author author = template.getForObject(authUrl+authorId, Author.class);
		Publisher publisher = template.getForObject(pubUrl+publisherId, Publisher.class);
		
		BookData bookData = new BookData();
		bookData.setBookId(book.getBookId());
		bookData.setTitle(book.getTitle());
		bookData.setPrice(book.getPrice());
		bookData.setPublisher(publisher);
		bookData.setAuthor(author);
		
		return bookData;
	}
}
