package com.training;

public class WrapperAndStatic {
	private int id;
	private static String aadharNumber;
	
	public void show() {
		System.out.println("Show= "+id);
		System.out.println("Show= "+aadharNumber);
	}
	public static void display() {
		//show();
		//System.out.println("Display= "+id);
		System.out.println("Display= "+aadharNumber);
		
	}
	
	public void parseStrNumber(String strNumber) {
		int number=Integer.parseInt(strNumber);
		System.out.println(number);
	}
	
	public String useStrNumber(int strNumber) {
		return Integer.toString(strNumber);
	}
	
	public Integer useValueOf() {
		String age="1010";
		return Integer.valueOf(age,2);
	}
}
