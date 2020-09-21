package com.training;

import com.training.model.Book;

public class UsingObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book headFirst1=new Book(100,"Head First Java","abc",900);
		Book headFirst2=new Book(100,"Head First Java","abc",900);
		System.out.println(headFirst1.equals(headFirst2));

	}

}
