package com.string;

public class String_Immutable {
public static void main(String[] args) {
	String s = "Mercury";
	String s1 = "Mercury";
	int identityHashCode = System.identityHashCode(s);
	System.out.println("memory of s:" +identityHashCode);
	
	int identityHashCode2 = System.identityHashCode(s1);
	System.out.println("memory of s1:" +identityHashCode2);
	
	//concatination
	
	String concat = s.concat(s1);
	System.out.println("concat:" +concat);
	
	int identityHashCode3 = System.identityHashCode(concat);
	System.out.println("memory of concat:" +identityHashCode3);
	

	
}
}
