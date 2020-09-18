package com.training;
import java.util.*;

public class BookService {
	ArrayList<Book> cart=new ArrayList<Book>();
	Book[] myCart=new Book[5];
	
	public void addBook(Book book) {		
			myCart[book.getBookId()]=book;	
	}
	
	public void getOne(Book book) {
		if(myCart[book.getBookId()]!=null) {
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
		
		for(int i=0;i<myCart.length;i++) {
			System.out.println();
			System.out.print("Name: "+myCart[i].getBookName()+", ");
			System.out.print("Id: "+myCart[i].getBookId()+", ");
			System.out.print("Written by: "+myCart[i].getAuthor()+", ");
			System.out.print("Price: "+myCart[i].getBookName()+", ");
		}
		
		
		
	}
}
