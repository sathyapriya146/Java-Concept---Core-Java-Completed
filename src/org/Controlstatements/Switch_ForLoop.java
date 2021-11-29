package org.Controlstatements;

public class Switch_ForLoop {
public static void main(String[] args) {
	
	System.out.println("Week Days");
	
	for (int a = 0; a <= 7; a++) {
		System.out.println(a);
		
		switch (a) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		
		default:
			System.out.println("Week Days completed");
			break;
			
		}
	}
}
}
