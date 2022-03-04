package com.trg.boot.pub.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Publisher {
	
	@Id
	private int publisherId;
	
	@Column(length = 30)
	private String name;
	//private int bookId;  will map the BookService application to the Publisher application via the publisherId
	//private int authorId; will map the BookService application to the Author application via the authorId
	private String address;
	
	public Publisher() {
		super();
	}
	
	public Publisher(int publisherId, String name, String address) {
		super();
		this.publisherId = publisherId;
		this.name = name;
		this.address = address;
	}

	public int getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
