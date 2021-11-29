package org.Controlstatements;

import java.util.Scanner;

public class If_Else {
public static void main(String[] args) {
	
	Scanner vote = new Scanner(System.in);
	System.out.println("Age");
	
	int a = vote.nextInt();
	if(a>=18) {
		System.out.println(a);
		}
	else{
		System.out.println("No");
	}
}
}
