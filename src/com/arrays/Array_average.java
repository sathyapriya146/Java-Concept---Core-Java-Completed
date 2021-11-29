package com.arrays;

public class Array_average {
	public static void main(String[] args) {

		float a[] = new float[10];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		a[6] = 7;
		a[7] = 8;
		a[8] = 9;
		a[9] = 10;

		float sum = a[0] + a[1] + a[2] + a[3] + a[4] + a[5] + a[6] + a[7] + a[8] + a[9];
		System.out.println(sum);
		float average = sum / 10;
		System.out.println(average);
	}
}
