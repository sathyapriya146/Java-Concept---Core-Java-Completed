package com.execption;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exception_concept {
	
	//static String name;

	public static void main(String[] args) {
		//System.out.println(name.charAt(0));        //Null pointer Exception

//		int num1 = 10;
//		int num2 = 0;
//		System.out.println("calculation started");
//		System.out.println(num1 / num2);              //Arithmetic Exception
//		System.out.println("process completed");
//		
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter your Age : ");
//		int i = s.nextInt();	                     // Input Mismatch Exception
//		System.out.println("I = "+ i);
//		System.out.println("Process completed");
		
		int a[] = new int [2];
		a[2] = 12;	                                 //Array Index out of Bounds exception
		System.out.println(a[0]);;
	
//		String s = "stack";
//		System.out.println(s.charAt(5));	        //String Index out of Bounds Exception
//		
//		List<Object> l = new ArrayList<>();
//		l. add(10);
//		l.add(10);
//		l.add(125);
//		Object k = l.get(5);					   //Index out of Bounds Exception
//		System.out.println(k);
		
//		String f ="20@";
//		int j = Integer.parseInt(f);	          //Number format exception
//		System.out.println(j + 10);
//		
		
		
		
		
		
		
	}

	
}
