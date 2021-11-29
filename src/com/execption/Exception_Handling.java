package com.execption;

public class Exception_Handling {

	public static void main(String[] args) {
		int a = 10;
		//System.exit(0);           //terminate the entire program
		try {
			System.out.println(a / 0);
			// System.out.println(a/5);
		}
//	 catch (NullPointerException e) {
//		System.out.println("Catch the Exception");
//		// TODO Auto-generated catch block
//		e.printStackTrace();	 
//	}
	 catch (Exception f) {
		System.out.println("Catch the Exception");
		// TODO Auto-generated catch block
		f.printStackTrace();	 
	}
		finally {
			System.exit(0);       //terminate the entire program
			System.out.println("I am in Finally Block");
		}
//	System.out.println(a/2);
//	System.out.println("Process Completed");
	}
}
