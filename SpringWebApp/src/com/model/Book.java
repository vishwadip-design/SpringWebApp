package com.model;

import java.math.BigDecimal;

public class Book {
private long bookId;
public long getBookId() {
	return bookId;
}
public void setBookId(long bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public Publisher getPublisher() {
	return publisher;
}
public void setPublisher(Publisher publisher) {
	this.publisher = publisher;
}
public BigDecimal getPrize() {
	return prize;
}
public void setPrize(BigDecimal prize) {
	this.prize = prize;
}
private String bookName;
private Publisher publisher;
private BigDecimal prize;
}
