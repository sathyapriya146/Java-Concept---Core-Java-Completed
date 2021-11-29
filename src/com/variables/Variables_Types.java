package com.variables;

public class Variables_Types {
	 static int a = 5; //class variable
	
	public static void variable() { // static variable (using static keyword, call directly without using object ref)
		int a= 4;
		System.out.println(a);
	}

	
//	public void variable() {
//		int a = 4;	//Local variable
//		System.out.println(a);
//	}

	public static void main(String[] args) {
		Variables_Types v = new Variables_Types();
	//	v.variable();
		variable(); // call directly without using object ref
		System.out.println(a);
	}
}
