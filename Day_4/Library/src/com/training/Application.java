package com.training;



import com.training.exceptions.MyCustomException;
import com.training.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		
		try {
			BookService myLibrary=new BookService();
			Book lotr=new Book("Lord of the Rings",200,"J R Tolkien",200);
			Book got=new Book("Game Of Thrones",201,"J R R Martin",200);
			Book fsog=new Book("50 shades of Gray",200,"J R Tolkien",200);
			Book fsd=new Book("Fifty shades darker",200,"J R Tolkien",200);
			
			
			myLibrary.addBook(lotr);
			myLibrary.addBook(got);
			myLibrary.addBook(fsog);
			//myLibrary.addBook(fsd);
			
			myLibrary.getOne(fsd);
			//myLibrary.getAll();
			
			
			
		} catch (MyCustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
