package com.keywords_java;

public class FINAL {
	 int speed= 60;
	final int speed1 = 40;
	float g = 34.345f;
	private void speed() {
		speed = 70;
		System.out.println(speed);
	}
	
	private  void speed1() {
		 int speed1 = 30;
		System.out.println("Final variable = "+speed1);		//final variable value can't be change

	}
	
	private final void speed2() {
		float g = 23.456f;
		System.out.println("Final method = "+g);			//final method can't be override
	}
	public static void main(String[] args) {
		FINAL f = new FINAL();
		f.speed();
		f.speed1();
		f.speed2();
		
	}
}
