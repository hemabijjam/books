package com.books.sql.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.books.sql.demo.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

}
