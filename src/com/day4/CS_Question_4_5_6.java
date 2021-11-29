package com.day4;

public class CS_Question_4_5_6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println(j);
			}
		}
		System.out.println();
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println(i);
			}
		}
		
		for (int i = 1; i <= 3; i++) {
			System.out.println();
			for (int j = 1; j <= i; j++) {
				System.out.println(j);
			}
		}
	}
	
	
}
