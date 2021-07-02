package com.books.sql.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.books.sql.demo.entity.Book;
import com.books.sql.demo.json.BookRequest;
import com.books.sql.demo.json.BookResponse;
import com.books.sql.demo.repository.BookRepository;

@RestController
@RequestMapping("books")
public class BookController {
	@Autowired
	private BookRepository bookRepository;
	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}
	@PostMapping
	public BookResponse put(@RequestBody BookRequest bookRequest) {
		final Book book = toBook(bookRequest);
		final Book bookSaved=bookRepository.save(book);
		final BookResponse bookresponse=toBookResponse(bookSaved);
		return bookresponse;	
	}
	@GetMapping("{id}")
	public BookResponse findById(@PathVariable Integer id) {
		final Book book = bookRepository.findById(id).get();
		final BookResponse bookresponse=toBookResponse(book);
		return bookresponse;
	}
	@GetMapping
	public List<Book> findall() { 
		return bookRepository.findAll();
	}
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Integer id) {
		bookRepository.deleteById(id);
	}
	private static final Book toBook(BookRequest bookRequest) {
		final Book book=new Book();
		book.setAuthour(bookRequest.getAuthour());
		book.setBook_name(bookRequest.getBook_name());
		book.setCopies(bookRequest.getCopies());
		return book;
	}
	private static final BookResponse toBookResponse(Book book) {
		final BookResponse bookresponse=new BookResponse();
		bookresponse.setAuthour(book.getAuthour());
		bookresponse.setBook_name(book.getBook_name());
		bookresponse.setCopies(book.getCopies());
		bookresponse.setId(book.getId());
		return bookresponse;
	}
	
}
