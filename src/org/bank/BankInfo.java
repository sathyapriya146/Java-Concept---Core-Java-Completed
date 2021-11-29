package org.bank;

public class BankInfo extends AxisBank{
public void saving() {
	System.out.println("Savings Amount : "+ "25000");
}
public void fixed() {
	System.out.println("Fixed Deposite : "+"50000");
	
}
public static void main(String[] args) {
	BankInfo b = new BankInfo();
	b.saving();
	b.fixed();
	b.deposite();
}
}
