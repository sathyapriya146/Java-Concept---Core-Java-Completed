package com.collection;


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class Collection_Iterator {
public static void main(String[] args) {
	Set<Object> s = new LinkedHashSet<>();
	s.add('a');
	s.add('b');
	s.add(1);
	s.add(2);
	System.out.println(s);
	
	
	Iterator<Object> i = s.iterator();
	while (i.hasNext()) {
		Object o =  i.next();
		System.out.println(o);
		}
	
	
		List<Object> d = new ArrayList<>();
		
		d.add('p');
		d.add('q');
		d.add('r');
		d.add('s');
		System.out.println(d);
	
	ListIterator<Object> k = d.listIterator();
	
	while (k.hasNext()) {
		Object object = (Object) k.next();
		System.out.println(object);
	}
	System.out.println();
	while (k.hasPrevious()) {
		Object previous = k.previous();
		System.out.println(previous);
	}
	
	
	
	}
		
		
	}


