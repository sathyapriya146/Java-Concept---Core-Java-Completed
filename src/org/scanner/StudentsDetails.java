package org.scanner;

import java.util.Scanner;

public class StudentsDetails {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("StudentId : ");
	int s1 = s.nextInt();
	System.out.println(s1);
	
	System.out.println("StudentName : ");
	String s2 = s.nextLine();
	System.out.println(s2);
	
	System.out.println("StudentEmail : ");
	String s3 = s.nextLine();
	System.out.println(s3);
	
	System.out.println("StudentPhoneno : ");
	String s4 = s.nextLine();
	System.out.println(s4);
	
	System.out.println("StudentDept : ");
	String s5 = s.nextLine();
	System.out.println(s5);
	
	System.out.println("StudentGender : ");
	String s6 = s.nextLine();
	System.out.println(s6);
	
	System.out.println("StudentCity : ");
	String s7 = s.nextLine();
	System.out.println(s7);
}
}
