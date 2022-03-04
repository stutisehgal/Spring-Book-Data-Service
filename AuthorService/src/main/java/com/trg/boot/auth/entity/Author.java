package com.trg.boot.auth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {

	@Id
	private int authorId;
	
	@Column(length = 30)
	private String auth_name;
	//private int bookId;  will map the BookService application to the Publisher application via the publisherId
	//private int authorId; will map the BookService application to the Author application via the authorId
	private String subject;
	private int mobile;
	
	public Author() {
		super();
	}
	
	public Author(int authorId, String auth_name, String subject, int mobile) {
		super();
		this.authorId = authorId;
		this.auth_name = auth_name;
		this.subject = subject;
		this.mobile = mobile;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuth_name() {
		return auth_name;
	}

	public void setAuth_name(String auth_name) {
		this.auth_name = auth_name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
	
}
