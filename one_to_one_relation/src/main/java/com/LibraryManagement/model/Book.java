package com.LibraryManagement.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String bookName;
	private String buthorName;
	private double bookPrice;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "book_id")
	private BookDetail bookDetail;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getButhorName() {
		return buthorName;
	}
	public void setButhorName(String buthorName) {
		this.buthorName = buthorName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public BookDetail getBookDetail() {
		return bookDetail;
	}
	public void setBookDetail(BookDetail bookDetail) {
		this.bookDetail = bookDetail;
	}
	

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", buthorName=" + buthorName + ", bookPrice=" + bookPrice
				+ ", bookDetail=" + bookDetail + "]";
	}
	
	
	
}
