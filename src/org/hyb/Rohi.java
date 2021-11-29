package org.hyb;

public class Rohi implements Arun,Sid{

	@Override
	public void Poo() {
		System.out.println("Poomathi");
	}

	@Override
	public void sid() {
		System.out.println("Siddharth");
	}

	@Override
	public void arun() {
		System.out.println("Arun");
	}
	
	public static void main(String[] args) {
		Rohi h = new Rohi();
		h.Poo();
		h.sid();
		h.arun();
	}
}
