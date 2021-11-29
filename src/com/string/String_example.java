package com.string;

public class String_example {
	public static void main(String[] args) {
		String g = "String Concept";
		System.out.println(g);

		int length = g.length();
		System.out.println(length);

		boolean eq = g.equals("String Concept");
		System.out.println(eq);

		boolean eq_ig = g.equalsIgnoreCase("string concept");
		System.out.println(eq_ig);

		String lc = g.toLowerCase();
		System.out.println(lc);

		String uc = g.toUpperCase();
		System.out.println(uc);

		boolean sw = g.startsWith("St");
		System.out.println(sw);

		boolean ew = g.endsWith("pt");
		System.out.println(ew);

		boolean c = g.contains(" ");
		System.out.println(c);

		int io = g.indexOf('t');
		System.out.println(io);

		int lio = g.lastIndexOf('t');
		System.out.println(lio);

		char cat = g.charAt(5);
		System.out.println(cat);

		String r = g.replace("String", "Array");
		System.out.println(r);

		// removes whitespace from both ends of a string
		String t1 = "   storing a multiple values   ";
		String trim = t1.trim();
		System.out.println(trim);

		// Each character of both the strings is converted into a
		// Unicode value for comparison
		String d1 = " ";
		String d2 = "clock";
		String d3 = "CLOCK";
		int i = d1.compareTo(d2);
		System.out.println(i);
		int j = d2.compareTo(d3);
		System.out.println(j);
		int k = d3.compareTo(d1);
		System.out.println(k);

		String sub = g.substring(4);
		System.out.println(sub);

		String sub1 = g.substring(4, 8);
		System.out.println(sub1);

		boolean emp = d1.isEmpty();
		System.out.println(emp);

		String w = "collection or group of words or special characters";
		String[] split = w.split(" ");
		for (String string : split) {
			System.out.println(string);
		}

	}
}
