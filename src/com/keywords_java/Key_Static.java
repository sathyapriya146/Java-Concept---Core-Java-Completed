package com.keywords_java;

public class Key_Static {
	
	static int x = 2;
	
	static {
		System.out.println("static block");
	}

	public static void unit() {
		int y = 3;
		System.out.println(y);
	}

	public static void main(String[] args) {
		unit();
		System.out.println(x);
	}
	//float g = 3.145f;
	//public void home() {
		//System.out.println(g);
//	}
	
}
