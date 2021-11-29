package com.string;

public class String_Task_8_9_10 {
public static void main(String[] args) {
	System.out.println("Task_8");
	String d = "Welcome to java class";
	String r = d.replace(" ","#");
	System.out.println(r);
	System.out.println();
	
	System.out.println("Task_9");
	String u = "WelcomE";
	String w = u.toLowerCase();
	String i = w.replace("elcom", "ELCOM");
	System.out.println(i);
	
	System.out.println();
	System.out.println("Task_10");
	String p = "Welcome";
	String s = p.replace('e', '@');

	String q = s.replace('o', '@');
	System.out.println(q);
	
	

}	
}
