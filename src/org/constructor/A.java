package org.constructor;

public class A extends B {
	public A() {
		super(12);
		System.out.println("Default constructor");
	}

	public static void main(String[] args) {
		A a = new A();

	}

}
