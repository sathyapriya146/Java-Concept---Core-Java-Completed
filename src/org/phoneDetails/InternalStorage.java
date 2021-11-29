package org.phoneDetails;

public class InternalStorage {
public void processorName() {
	System.out.println("kavi");
}
public void ramSize() {
	System.out.println(50);
}
public static void main(String[] args) {
	InternalStorage i = new InternalStorage();
	i.processorName();
	i.ramSize();
	
	ExternalStorage e = new ExternalStorage();
	e.size();
	
}
}
