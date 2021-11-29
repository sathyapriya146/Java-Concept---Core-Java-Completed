package org.scanner;

import java.util.Scanner;

public class StudSum extends StudMarks{
public static void main(String[] args) {
		
	Scanner SM = new Scanner(System.in);
//	System.out.println("studId");
//	int studId = SM.nextInt();
//	System.out.println(studId);
	
//	System.out.println("studName");
//	String studName = SM.next();
//	System.out.println(studName);
	
	System.out.println("Find the sum");
	int M1 = SM.nextInt();
	int M2 = SM.nextInt();
	int M3 = SM.nextInt();
	int M4 = SM.nextInt();
	int M5 = SM.nextInt();
	
	int sum =M1+M2+M3+M4+M5 ;
	
	
	System.out.println(sum);
	System.out.println("Find the average");
	float  average = sum/5;
	System.out.println( average);
	
	
	
}
}
