package com.day2;

public class Arts_Q_11 extends Education_Q_11{			//Note: Multilevel inheritance
public void bsc() {											//c1
	System.out.println("Bsc Maths");						//c2
															//c3
}															//c4
public void bEd() {										//c1 extends c4
														//c4 extends c3
System.out.println("BEd Maths");						//c2 extends c1					
}														// call the methods
public void bA() {
	System.out.println("BA English");
	
}
public void bBA() {
	System.out.println("BBA");

}
public static void main(String[] args) {
	 Arts_Q_11 a = new  Arts_Q_11();
	 a.bsc();
	 a.bEd();
	 a.bA();
	 a.bBA();
	 a.ug();
	 a.pg();
	 a.bE();
	 a.bTech();
	 a.physiyo();
	 a.dental();
	 a.mbbs();
	 
	 
	 
}
}
