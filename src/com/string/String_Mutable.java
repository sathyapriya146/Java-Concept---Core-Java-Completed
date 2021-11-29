package com.string;

public class String_Mutable {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("mars");
	StringBuffer sb1 = new StringBuffer("mars");
	
	int identityHashCode = System.identityHashCode(sb);
	System.out.println("memory of sb:" +identityHashCode);
	
	int identityHashCode2 = System.identityHashCode(sb1);
	System.out.println("memory of sb1:" +identityHashCode2);
	
	//append
	
	StringBuffer append = sb.append(sb1);
	System.out.println("append:" +append);
	
	int identityHashCode3 = System.identityHashCode(append);
	System.out.println("memory of append:" +identityHashCode3);
}
}
