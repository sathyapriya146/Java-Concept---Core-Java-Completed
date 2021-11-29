package org.Controlstatements;

public class Do_While {
	public static void main(String[] args) {
		 int a = 25;
		do {
			if (a == 20) {
				System.out.println("Teen age completed");
				break;
			}
			System.out.println(a);
			a--;
		} while (a >= 18);
	
		
	}
}
