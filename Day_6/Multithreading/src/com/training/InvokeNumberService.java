package com.training;

public class InvokeNumberService implements Runnable {

	private int countUpTo;
	private String threadName;
	
	private NumberService service;
	public InvokeNumberService(int countUpTo, String threadName) {
		super();
		//Setting the parameter passed from main method here
		this.countUpTo = countUpTo;
		this.threadName = threadName;
		
		//passing the service instance which is a runnable to thread class along with a name as arguments
		service=new NumberService();
		Thread thread=new Thread(this, threadName);
		thread.start();
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Calling the code that has to be executed in a thread
		//Indirectly adding a piece of code to run method
		this.service.sumNumbers(countUpTo);
	}

}
