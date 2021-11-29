package org.lang;

public class LanguageInfo {

	public void tamilLanguage() {
		System.out.println("Tamil");
	}
	public void englishLanguage() {
		System.out.println("English");
	}
	public void hindiLanguage() {
		System.out.println("Hindi");
	}
	public static void main(String[] args) {
	 LanguageInfo lang = new LanguageInfo();
		lang.tamilLanguage();
		lang.englishLanguage();
		lang.hindiLanguage();
	}
}
