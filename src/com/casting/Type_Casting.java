package com.casting;

public class Type_Casting {
public static void main(String[] args) {
	
	// Widening typecasting
	int a = 20;
	long l = a;
	double d = a;
	System.out.println(a);
	System.out.println(l);
	System.out.println(d);
	
	// Narrow typecasting
	double d1 = 2.1554;
	long l1 = (long) d1;
	int a1 = (int) d1;
	System.out.println(d1);
	System.out.println(l1);
	System.out.println(a1);
}
}




