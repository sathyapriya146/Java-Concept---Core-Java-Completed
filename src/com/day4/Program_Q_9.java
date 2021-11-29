package com.day4;

public class Program_Q_9 {
	public static void main(String[] args) {

		System.out.println("one");
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Two");
		int i, j, row = 5;
		for (i = 0; i < row; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Three");
		int k, k2, row1 = 5;
		for (k = 0; k < row1; k++) {

			for (k2 = row - k; k2 > 1; k2--) {
				System.out.print(" ");
			}
			for (k2 = 0; k2 <= k; k2++) {
				System.out.print("* ");

			}
			System.out.println();
		}
	}
}
