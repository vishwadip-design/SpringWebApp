package com.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.Controller;


import com.service.BookManager;

public class BookListController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		BookManager bookManager=new BookManager();
		ModelAndView modelAndView=new ModelAndView("bookList");
		modelAndView.addObject("bookList",bookManager.getBookList());
		return modelAndView;
	}

}
