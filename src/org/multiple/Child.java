package org.multiple;

public class Child implements Parent1,Parent2{

	@Override
	public void two() {
		System.out.println("P2");
	}

	@Override
	public void one() {
		System.out.println("P1");
		
	}
public static void main(String[] args) {
	Child M = new Child();
	M.one();
	M.two();
}
}
