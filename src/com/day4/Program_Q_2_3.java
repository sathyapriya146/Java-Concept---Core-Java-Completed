package com.day4;

import java.util.Scanner;

public class Program_Q_2_3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		System.out.println(a);
		if (a % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");

		}
		System.out.println();
		System.out.println("Enter the Number : ");
		int b = sc.nextInt();
		System.out.println("Even Numbers : ");
		for (int i = 1; i <= b; i++) {
			if (i % 2 == 0) { // % denotes remainder values
				System.out.println(i);

			}
		}

		System.out.println("Odd Numbers : ");
		for (int i = 1; i <= b; i++) {

			if (i % 2 == 1) {
				System.out.println(i);

			}
		}

	}
}
