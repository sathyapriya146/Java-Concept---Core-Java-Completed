package com.arrays;

public class Arrays {
public static void main(String[] args) {
			
		String x[] = new String[5];//only one data type can be used
		x[0] = "Array";
		x[1] = "Set";
		x[2] = "Char";
		x[3] = "Integer";
		x[4] = "String";
		x[4] = "Integer";
		x[4] = "Int";		//it can be override
		
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
	
	
}

