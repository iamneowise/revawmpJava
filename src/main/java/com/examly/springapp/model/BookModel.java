package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookModel {
	@Id
	private String ssn;
	private String bookName;
	private String authorName;
	private String genre;
	private int price;

	public BookModel(){
		super();
	}


	public BookModel(String ssn, String bookName, String authorName, String genre, int price) {
		super();
		this.ssn = ssn;
		this.bookName = bookName;
		this.authorName = authorName;
		this.genre = genre;
		this.price = price;
	}

	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


}
