package com.day4;

import java.util.Scanner;

public class Program_Q_1 {
public static void main(String[] args) {
	Scanner age = new Scanner(System.in);
	
	System.out.println("Priya : "+age);
	int i = age.nextInt();
	
	if (i<=18) {
		System.out.println("not elligible");
	}
	else {
		System.out.println("elligible");
	}
}
}
