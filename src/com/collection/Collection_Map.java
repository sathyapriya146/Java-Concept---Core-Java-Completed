package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Collection_Map {
	public static void main(String[] args) {
		Map<Character, Float> cf = new HashMap<>();
		cf.put('s', 1.23f);
		cf.put('c', 2.23f);
		cf.put('t', 3.23f);
		cf.put('n', null);
		cf.put('p', null);
		cf.put(null, 4.23f);
		cf.put(null, 5.23f);
		System.out.println(cf);

		int i = cf.size();
		System.out.println(i);

		Float f1 = cf.get('c');
		System.out.println(f1);

		Map<String, Byte> sb = new LinkedHashMap<>();
		sb.put("Mani", (byte) 23);
		sb.put("Kani", (byte) 25);
		sb.put("Nani", null);
		sb.put("lion", null);
		sb.put(null, (byte) 52);
		sb.put(null, (byte) 32);
		System.out.println(sb);

		Map<String, Integer> si = new TreeMap<>();
		si.put("Latha", 5);
		si.put("Mani", 23);
		si.put("Kani", 25);
		si.put("Nani", null);
		si.put("Na", null);
		Collection<Integer> v = si.values();
		System.out.println(v);

		Set<String> ks = sb.keySet();
		System.out.println(ks);

		Map<String, Integer> is = new Hashtable<>();
		is.put("one", 1);
		is.put("two", 2);
		is.put("three", 1);
		is.put("four", 2);
		System.out.println(is);

		si.putAll(is);
		System.out.println(si);

		boolean ck = is.containsKey("one");
		System.out.println(ck);

		Map<Character, Float> c = new ConcurrentHashMap<>();
		c.put('s', 1.23f);
		c.put('c', 2.23f);
		c.put('t', 3.23f);
		System.out.println(c);
	}
}
