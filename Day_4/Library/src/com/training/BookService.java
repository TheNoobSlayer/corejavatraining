package com.training;
import java.util.*;

public class BookService {
	ArrayList<Book> cart=new ArrayList<Book>();
	public boolean addBook(Book book) {
		
		if(cart.add(book)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void getOne(Book book) {
		if(cart.contains(book)) {
			System.out.println();
			System.out.print("Name: "+book.getBookName()+", ");
			System.out.print("Id: "+book.getBookId()+", ");
			System.out.print("Written by: "+book.getAuthor()+", ");
			System.out.print("Price: "+book.getBookName()+", ");
		}else {
			throw new NoSuchElementException();
		}
	}
	
	public void getAll() {
		
		for(Book oneBook:cart) {
			System.out.println();
			System.out.print("Name: "+oneBook.getBookName()+", ");
			System.out.print("Id: "+oneBook.getBookId()+", ");
			System.out.print("Written by: "+oneBook.getAuthor()+", ");
			System.out.print("Price: "+oneBook.getBookName()+", ");
		}
		
		
		
	}
}
