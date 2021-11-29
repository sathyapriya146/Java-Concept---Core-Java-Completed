package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Collection_Set {
public static void main(String[] args) {
	Set<Object> s = new HashSet<>();
	s.add("Hai");
	s.add(10);
	s.add(null);
	s.add('p');
	s.add(0.213);
	
	System.out.println(s);
	
	int i = s.size();
	System.out.println(i);
	
	boolean c = s.contains(10);
	System.out.println(c);
	
	s.remove(null);
	System.out.println(s);
	
	Set<Object> a = new LinkedHashSet<>();
	a.add(20);
	a.add(2.01);
	System.out.println(a);
	
	a.addAll(s);
	System.out.println(a);
	
}
}
