package org.alllangmultilevel;

import org.tamil.Tamil;

public class Language extends Tamil{
	public void allLanguage() {
		System.out.println("ALL LANGUAGES");
	}
public static void main(String[] args) {
	Language s = new Language();
	s.allLanguage();
	s.tamilLanguage();
	s.englishLanguage();
	s.teluguLanguage();
}
}
