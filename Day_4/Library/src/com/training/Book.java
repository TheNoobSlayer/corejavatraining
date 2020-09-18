package com.training;

import com.training.exceptions.MyCustomException;
import com.training.exceptions.RangeCheckException;

public class Book {
	private String bookName;
	private int bookId;
	private String author;
	private int price;
	
	
	private final String  RANGE_ERR_MESSAGE= "Balance Amount should be 100 to 500";
	private final String  NULL_ERR_MESSAGE= "Book name is compulsory";
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookName, int bookId, String author, int price) throws MyCustomException, RangeCheckException {
		super();
		if(bookName.length()==0) {
			throw new MyCustomException(NULL_ERR_MESSAGE);
		}
		this.bookName = bookName;
		
		
		this.bookId = bookId;
		this.author = author;
		
		if(price<100 || price >500) {
			throw new RangeCheckException(RANGE_ERR_MESSAGE);
		}
		this.price = price;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) throws MyCustomException {
		
			try {
				if(bookName.length()==0) {
					throw new NullPointerException();
				}
				
			} catch (NullPointerException e) {
				// TODO: handle exception
				throw new MyCustomException(NULL_ERR_MESSAGE, e);
			}
		
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) throws RangeCheckException {
		if(price<100 || price >500) {
			throw new RangeCheckException(RANGE_ERR_MESSAGE);
		}
		this.price = price;
	}
	
}
