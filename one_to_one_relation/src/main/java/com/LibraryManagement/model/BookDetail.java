package com.LibraryManagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bookdetail")
public class BookDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String publicationAddress;
	@OneToOne(mappedBy = "bookdetail")	
	private  Book book;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPublicationAddress() {
		return publicationAddress;
	}
	public void setPublicationAddress(String publicationAddress) {
		this.publicationAddress = publicationAddress;
	}

	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "BookDetail [id=" + id + ", publicationAddress=" + publicationAddress + ", book=" + book + "]";
	}
	
}
