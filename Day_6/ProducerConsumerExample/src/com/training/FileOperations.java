package com.training;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOperations {
	public synchronized void writeToFile(String[] array)
	{
		PrintWriter writer = null;
		
		try {
			 writer = new PrintWriter(new FileWriter("File.txt"));
			 		 
			 for(int i =0;i<array.length;i++)
			 {
				 				 
				 writer.write(array[i]);
				 //writer.println(array[i].toString());
			 }
			 System.out.println("Writing done");
			notify();		 
		} catch (FileNotFoundException e) {
		
			System.err.println(e);
			e.printStackTrace();
		}catch(IOException e)
		{
			System.err.println(e);
			e.getStackTrace();
		}
		finally
		{
			try {
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void readFromFile()
	{
		BufferedReader reader=null;
		String line= null;
		try {
			 reader = new BufferedReader(new FileReader("File.txt"));
			 
			 try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 while((line=reader.readLine())!=null)
			  {	
              System.out.println("File contents:"+line);
			  }
		}catch (FileNotFoundException e) {
		
			System.err.println(e);
			e.printStackTrace();
		}catch(IOException e)
		{
			System.err.println(e);
			e.getStackTrace();
		}
		finally
		{
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
