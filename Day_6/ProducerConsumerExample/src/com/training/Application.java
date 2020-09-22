/**
 * 
 */
package com.training;

/**
 * @author DELL
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName());
		//new FileOperationServices("Writer Thread");
		//new FileOperationServices("Reader Thread");
		String[] array1 = {"Riya","Mohan","Payal","Neha","Chaitali"};
		FileOperations file = new FileOperations();
		Thread writeThread = new Thread()
		{
			//System.out.println("thread created...");
			@Override
			public void run()
			{
				System.out.println("Within write run method...");
				file.writeToFile(array1);
			}
			
		};
		writeThread.start();
		
		Thread readThread = new Thread()
		{
			//System.out.println("thread created...");
			@Override
			public void run()
			{
				System.out.println("Within read run method...");
				file.readFromFile();
			}
			
		};
		readThread.start();
        
	}

}
