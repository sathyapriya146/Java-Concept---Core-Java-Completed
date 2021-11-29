package com.arrays;

public class Array_char {
public static void main(String[] args) {
	char x[] = new char[5];
	x[0] = 'A';
	x[1] = 'S';
	x[2] = 'C';
	x[3] = 'I';
	x[4] = 'S';
	x[4] = 'T';
	x[4] = 'N';		//it can be override
	
	
	for (int i = 0; i < x.length; i++) {
		System.out.println(x[i]);
	}
}

}

