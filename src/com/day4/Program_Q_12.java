package com.day4;

import java.util.Scanner;

public class Program_Q_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int count = 0;
		
while (num!=0) {
	num=num/10;
	count++;
}
System.out.println("count the given number : "+count);
	}
}
