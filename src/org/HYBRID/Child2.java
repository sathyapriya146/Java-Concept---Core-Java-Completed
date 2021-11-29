package org.HYBRID;

public class Child2 implements Parent2,Child1{

	@Override
	public void parent1() {
		System.out.println("P1");
	}

	@Override
	public void child1() {
		System.out.println("C1");
	}

	@Override
	public void parent2() {
		System.out.println("P2");
	}

	public static void main(String[] args) {
		Child2 H = new Child2();
		H.child1();
		H.parent1();
		H.parent2();
		
	}
}
