package org.bank_override;

public class AxisBank extends BankInfo{
	
public void deposite(int a) {
	super.deposite(a);
	System.out.println("bank : "+a);
}
public static void main(String[] args) {
	AxisBank a= new AxisBank();
	a.deposite(50000);
	
}
}
