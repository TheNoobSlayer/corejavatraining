package com.training.services;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.training.model.Book;

public class BookService {
	
	public boolean writeobject(Book book){
		boolean persisted=false;
		ObjectOutputStream outputStream=null;
		try {
			outputStream=new ObjectOutputStream(new FileOutputStream((new File("book.ser"))));
			outputStream.writeObject(book);
			persisted=true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return persisted;
	}
	
	public Book readObject() {
		
		Book book=null;
		ObjectInputStream inputStream=null;
	
		
			try {
				inputStream=new ObjectInputStream(new FileInputStream(new File("book.ser")));
				book=(Book) inputStream.readObject();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return book;
		
	}
	
	public boolean writeWithDataStream(Book bk,File file) {
		boolean persisted=false;
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);    
			DataOutputStream data = new DataOutputStream(fileOutputStream);
			data.writeInt(bk.getBookNumber());
			data.writeUTF(bk.getBookName());
			data.writeDouble(bk.getPrice());
			data.writeUTF(bk.getAuthor());
			persisted=true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return persisted;
	}
	
	public Book readWithDataStream(File file) {
		Book book=new Book();
		DataInputStream data=null;
		try {
			FileInputStream fileInputStream=new FileInputStream(file);
			data=new DataInputStream(fileInputStream);
			book.setBookNumber(data.readInt());
			book.setBookName(data.readUTF());
			book.setPrice(data.readDouble());
			book.setAuthor(data.readUTF());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		return book;
	}
}
