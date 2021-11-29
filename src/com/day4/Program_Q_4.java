package com.day4;

import java.util.Scanner;

public class Program_Q_4 {

	public static void main(String[] args) {
		int c = 0;
		System.out.println("Prime numbers : ");
				for (int i = 1; i < 10; i++) {
					int count = 0;
			for (int j = 2; j < i / 2; j++) {

				if (i % j == 0) {
					count = 1;
				}
			}
			if (count == 0) {
				System.out.print(i+ ", ");
				c++;
			}
		}
		System.out.println();
			System.out.println("count of prime numbers in 1 to 10 : " + c);
		
		}

	}

