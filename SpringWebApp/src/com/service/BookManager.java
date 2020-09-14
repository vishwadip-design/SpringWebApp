package com.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.model.Book;
import com.model.Publisher;

public class BookManager {

	public static List<Book>bookList=new ArrayList<Book>();
	static {
		Publisher publisherset1=new Publisher();
		publisherset1.setPublisherId((long)1);
		publisherset1.setPublisherName("SPD");
		
		Book bookset1=new Book();
		bookset1.setBookId((long)1);
		bookset1.setBookName("Spring");
		bookset1.setPrize(new BigDecimal(1235.3));
		bookset1.setPublisher(publisherset1);
		
		Book bookset2=new Book();
		bookset2.setBookId((long)2);
		bookset2.setBookName("Java");
		bookset2.setPrize(new BigDecimal(1245.3));
		bookset2.setPublisher(publisherset1);
		
		Book bookset3=new Book();
		bookset3.setBookId((long)3);
		bookset3.setBookName("Hibernate");
		bookset3.setPrize(new BigDecimal(1135.1));
		bookset3.setPublisher(publisherset1);
		bookList.add(bookset3);
		bookList.add(bookset2);
		bookList.add(bookset1);
		
	}
	public List<Book>getBookList(){
	return bookList;
	}
}
