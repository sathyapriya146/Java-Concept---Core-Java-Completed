package org.emp;

public class Employee {
	
	public void empId() {
		System.out.println("employee");
	}
	public void empId(int a) {
		System.out.println(a);
	}
	public void empId(float f) {
		System.out.println(f);
	}
	
	
//	public void empName() {
//		System.out.println("Priya");
//	}
//	
//	public void empDob() {
//		System.out.println("6-14");
//	}
//	
//	public void empphone() {
//		System.out.println("987654321");
//	}
//	
//	public void empEmail() {
//		System.out.println("priya77@gmail.com");
//	}
//	
//	public void empAddress() {
//		System.out.println("chennai");
//	}
//	
	public static void main(String[] args) {
		Employee details = new Employee();
		
		details.empId();
		details.empId(10);
		details.empId(2.103f);
//		details.empName();
//		details.empDob();
//		details.empphone();
//		details.empEmail();
//		details.empAddress();
//		
		
	}
}
