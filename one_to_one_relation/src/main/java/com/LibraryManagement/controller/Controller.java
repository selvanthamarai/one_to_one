package com.LibraryManagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LibraryManagement.model.Book;
import com.LibraryManagement.service.Service;

@RestController
@RequestMapping("/lib")
public class Controller {

	
	private Service service;
	
	@PostMapping("/add")
	public void add(@RequestBody Book book) {
		service.addDetail(book);
	}
	
	@GetMapping("/getall")
	public List<Book>getall(){
		return service.findall();
	}
	
	
}
