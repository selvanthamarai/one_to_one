package com.LibraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LibraryManagement.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	
	
}
