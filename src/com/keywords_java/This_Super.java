package com.keywords_java;

public class This_Super  // extends Key_Static
{
	float g = 12.345f;

	public void testing() {
		float g = 11.234f;
		System.out.println("Local variable : " + g);
		System.out.println("Class or Instance variable : " + this.g);
		// System.out.println("Parent class variable: "+super.g);
	
	}

	public static void main(String[] args) {
		This_Super k = new This_Super();
		k.testing();
		
	}
}
