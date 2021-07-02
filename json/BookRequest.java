package com.books.sql.demo.json;

public class BookRequest {
	private String book_name;
	private Integer copies;
	private String authour;
	private Integer id;
	public Integer getId() {
		return id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public Integer getCopies() {
		return copies;
	}
	public void setCopies(Integer copies) {
		this.copies = copies;
	}
	public String getAuthour() {
		return authour;
	}
	public void setAuthour(String authour) {
		this.authour = authour;
	}
}
