package org.Controlstatements;

import java.util.Scanner;

public class If_Else_If_Else {
public static void main(String[] args) {
	Scanner age = new Scanner(System.in);
	System.out.println("Age");
	int a = age.nextInt();
	if(a==20) {
		System.out.println("No");
	}
	else if(a<=12) {
		System.out.println("No No");
	}
	else {
		System.out.println("Exactly");
	}
}
}
