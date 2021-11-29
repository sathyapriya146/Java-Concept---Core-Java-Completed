package org.Controlstatements;

public class While {
	public static void main(String[] args) {
		int a = 1;

		while (a <= 10) {
			a++;
			if (a == 5) {

				continue;
			}

			System.out.println(a);

		}
	}
}
