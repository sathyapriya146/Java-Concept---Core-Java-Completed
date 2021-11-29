package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection_List {
	public static void main(String[] args) {
		List<Object> l = new ArrayList<>();
		System.out.println(l);

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);

		int s = l.size();
		System.out.println(s);

		Object ob = l.get(2);
		System.out.println(ob);

		l.set(2, 10);
		System.out.println(l);

		l.remove(3);
		System.out.println(l);

		int inof = l.indexOf(10);
		System.out.println(inof);

		int linof = l.lastIndexOf(10);
		System.out.println(linof);

		boolean c = l.contains(40);
		System.out.println(c);

//	l.clear();
//	System.out.println(l);

		List<String> l1 = new ArrayList<>();
		System.out.println(l1);

		l1.add("A group of object is called collection");
		System.out.println(l1);
		l.addAll(l1);
		System.out.println(l);

		List<Byte> l2 = new LinkedList<>();
		System.out.println(l2);
		l2.add((byte) 25);
		System.out.println(l2);
		l.addAll(l2);
		System.out.println(l);

		List<Character> l3 = new Vector<>();
		l3.add((Character) 'h');
		System.out.println(l3);
		l.addAll(l3);
		System.out.println(l);
		
		l.removeAll(l1);
		System.out.println(l);
		
		l.retainAll(l2);
		System.out.println(l);
		

	}
}
