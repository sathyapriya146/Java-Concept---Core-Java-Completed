package org.Break_Continue;

public class Break {
	public static void main(String[] args) {
		System.out.println("Teen Age");
		for (int i = 13; i <= 25; i++) {

			if (i == 20) {
				System.out.println("Teen Age Completed");
				break;
			}
			System.out.println(i);
		}

	}
}
