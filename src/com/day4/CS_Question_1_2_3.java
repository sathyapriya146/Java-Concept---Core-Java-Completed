package com.day4;

public class CS_Question_1_2_3 {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				System.out.println("processing");
				//break;
				continue;
			}

			System.out.println(i);
		}
	}
}
