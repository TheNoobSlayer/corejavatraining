package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting grtObj=new Greeting();
		System.out.println(grtObj.getMessage());
		
		Book headFirst=new Book();
		headFirst.setBookNumber(1010);
		Book spring=new Book(2020,456,"Mastering Spring","Orielly","Ramesh");
		System.out.println(spring.getBookName());
		System.out.println(spring.getPrice());

		
	}

}
