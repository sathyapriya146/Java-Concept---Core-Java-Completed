package com.day4;

import java.util.Scanner;

public class Program_Q_3_4_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int d = sc.nextInt();
		int sum = 0, count = 0;
		System.out.println("Even numbers : ");
		for (int i = 1; i <= d; i++) {
			if (i % 2 == 0) {

				System.out.print(i + ",");
				sum = sum + i;
				count = count + 1;
			}
		}
		System.out.println();
		System.out.println("sum of even numbers : " + sum);
		System.out.println("count of even numbers : " + count);
		System.out.println();

		System.out.println("Odd numbers : ");
		int sum1 = 0, count1 = 0;
		for (int i = 1; i <= d; i++) {
			if (i % 2 != 0) {

				System.out.print(i + ",");
				sum1 = sum1 + i;
				count1 = count1 + 1;
			}
		}
		System.out.println();
		System.out.println("sum of odd numbers : " + sum1);
		System.out.println("count of odd numbers : " + count1);
	}
}
