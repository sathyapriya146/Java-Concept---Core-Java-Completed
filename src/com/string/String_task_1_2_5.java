
package com.string;

import java.util.Scanner;

public class String_task_1_2_5 {
public static void main(String[] args) {
	System.out.println("Task_1");
		
	Scanner s = new Scanner(System.in);
	System.out.println("String :" );
	String st = s.nextLine();
	String reverse = "";
	
	for (int i = st.length()-1; i >=0; i--) {
		reverse = reverse + st.charAt(i);
		//System.out.println(reverse_st);
	}
	System.out.println(reverse);
	System.out.println();
	
	System.out.println("Task_2");
	
	System.out.println("String : ");
	String st1 = s.nextLine();
	String reverse_1 ="";
	for (int i = st1.length()-1; i >=0; i--) {
		reverse_1 = reverse_1 + st1.charAt(i);
		//System.out.println(reverse_st);
	}
	System.out.println(reverse_1);
	if (st1.equals(reverse_1)) 
	{
		System.out.println("palindrome");
		
	}
	else {
		System.out.println("Not palindrome");
	}
	System.out.println();
	
	System.out.println("Task_5");
	
	String p = "Welcome to java class java";
	
	String l = p.replace("java", "sql");
	System.out.println(l);
	
}
}
