package org.scanner;

import java.util.Scanner;

public class Scanner_task {
public static void main(String[] args) {
	
	Scanner details = new Scanner(System.in);
	
	System.out.println("empid");
	String next = details.next();
	System.out.println(next);
	
	System.out.println("name");
   	String next1 = details.next();
	System.out.println(next1);
	
	System.out.println("email");
	String nextInt = details.next();
	
	System.out.println(nextInt);
	
	System.out.println("phoneNum");
	int nextInt1 = details.nextInt();
	System.out.println(nextInt1);
	
	System.out.println("salary");
	int nextInt2 = details.nextInt();
	System.out.println(nextInt2);
	
	System.out.println("gender");
	String next2 = details.next();
	System.out.println(next2);
	
	System.out.println("city");
	String next3 = details.next();
	System.out.println(next3);
}
}
