package com.training;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.training.model.Book;
import com.training.services.BookService;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book headFirst=new Book(100,"Head First Java","abc",900);
		BookService bookService=new BookService();
		
		boolean result=bookService.writeWithDataStream(headFirst, new File("book2.ser"));
		if(result) {
			System.out.println("Book persisted");
			System.out.println(bookService.readWithDataStream(new File("book2.ser")));
		}else {
			System.out.println("Error Check");
		}
	}

}
