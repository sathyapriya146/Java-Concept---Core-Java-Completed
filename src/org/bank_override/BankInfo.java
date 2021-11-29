package org.bank_override;

public class BankInfo {
public void saving(int x) {
	System.out.println(x);
}
public void fixed(int y) {
	System.out.println(y);
	
}
public void deposite(int a) {
	System.out.println("off : "+a);
		
}
public static void main(String[] args) {
	BankInfo b = new BankInfo();
	b.saving(10000);
	b.fixed(30000);
	b.deposite(100000);
}

}
