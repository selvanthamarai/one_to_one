package com.LibraryManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.LibraryManagement.model.Book;
import com.LibraryManagement.repository.BookRepository;

public class Service {
@Autowired
private BookRepository rep;	




public void addDetail(Book book) {
	rep.save(book);
}


public List<Book>findall(){
	return this.rep.findAll();
}


}
