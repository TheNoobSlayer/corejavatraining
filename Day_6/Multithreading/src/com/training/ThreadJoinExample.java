package com.training;

import java.io.IOException;

public class ThreadJoinExample {

	public static void main(String[] args) {
		Thread t=new Thread() {

			@Override
			public void run() {
				System.out.println("Joining thread starts");
				// TODO Auto-generated method stub
				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Joining thread finishes");
			}
			
		};
		System.out.println("Thread starts");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Finished");
	}
}
