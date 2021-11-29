package com.string;

public class String_Task_6_7 {
	public static void main(String[] args) {
		
				
		String s = "Welcome";
		int vowels = 0;
		int consonents = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowels++;
			} 
				
			else {
				consonents++;
			}
		}

		System.out.println("vowels count:"+vowels);
		System.out.println("consonents count:"+consonents);
	}
}

