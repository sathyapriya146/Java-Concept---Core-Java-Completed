package org.college_multilevel;

public class College extends Student{
	public void collegeName() {
		System.out.println("SRM");
		}
public void collegeCode() {
	System.out.println(258);
	}
public void collegeRank() {
	System.out.println("5th");
	
}
public static void main(String[] args) {
	College c= new College();
	c.collegeName();
	c.collegeCode();
	c.collegeRank();
	c.studentName();
	c.studentDept();
	c.studentId();
	c.hostelName();
	c.deptName();
	
}

}
