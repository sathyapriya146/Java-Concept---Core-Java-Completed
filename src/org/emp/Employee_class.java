package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee_class {
	public void empName() {
	System.out.println("Priya");
	}
	
public static void main(String[] args) {
	Employee_class e = new Employee_class();
	e.empName();
	
	Client c = new Client();
	c.clientname();
	
	Company co = new Company();
	co.companyName();
	
	Project p = new Project();
	p.projectName();
}
	
	
}


