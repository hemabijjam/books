package com.books.sql.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {
	@Id
	@GeneratedValue
	private Integer id;
	private String book_name;
	private Integer copies;
	private String authour;
	public Book(Integer id, String book_name, Integer copies, String authour) {
		super();
		this.id = id;
		this.book_name = book_name;
		this.copies = copies;
		this.authour = authour;
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
