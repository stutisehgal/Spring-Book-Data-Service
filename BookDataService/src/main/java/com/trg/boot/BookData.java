package com.trg.boot;

public class BookData {

	private int bookId;
	private String title;
	private Publisher publisher;
	private Author author;
	private float price;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public BookData(int bookId, String title, Publisher publisher, Author author, float price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
	}
	public BookData() {
		super();
	}
	
	
}

