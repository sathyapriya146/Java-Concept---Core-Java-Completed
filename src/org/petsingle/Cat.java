package org.petsingle;

public class Cat extends Dog{
     public void kitten() {
	System.out.println("KITTEN");

}
     public static void main(String[] args) {
		Cat p = new Cat();
		p.kitten();
		p.puppy();
	}
}
