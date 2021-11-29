package com.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Collection_Map_ex {
	public static void main(String[] args) {
//	Map<Key,Value> refName = new (type of map)<Key,Value>();
		Map<Character, Float> cf = new HashMap<>();
		cf.put('s', 1.23f);
		cf.put('c', 2.23f);
		cf.put('t', 3.23f);
		cf.put('n', null);
		cf.put('p', null);
		cf.put(null, 4.23f);
		cf.put(null, 5.23f);
		cf.put(null, null);
		System.out.println(cf);

		Map<Character, Float> cf1 = new LinkedHashMap<>();
		cf1.put('s', 1.23f);
		cf1.put('c', 2.23f);
		cf1.put('t', 3.23f);
		cf1.put('n', null);
		cf1.put('p', null);
		cf1.put(null, 4.23f);
		cf1.put(null, 5.23f);
		cf1.put(null, null);
		System.out.println(cf1);

		Map<Character, Float> cf2 = new TreeMap<>();
		cf2.put('s', 1.23f);
		cf2.put('c', 2.23f);
		cf2.put('t', 3.23f);
		cf2.put('n', null);
		cf2.put('p', null);
//		 cf2.put(null, 4.23f);
//		 cf2.put(null, 5.23f);
//		cf2.put(null, null);
		System.out.println(cf2);

		Map<Character, Float> cf3 = new Hashtable<>();
		cf3.put('s', 1.23f);
		cf3.put('c', 2.23f);
		cf3.put('t', 3.23f);
//		cf3.put('n', null);
//		cf3.put('p', null);
//		cf3.put(null, 4.23f);
//		cf3.put(null, 5.23f);
//		cf3.put(null, null);
		System.out.println(cf3);

		Map<Character, Float> cf4 = new ConcurrentHashMap<>();
		cf4.put('s', 1.23f);
		cf4.put('c', 2.23f);
		cf4.put('t', 3.23f);
//		cf4.put('n', null);
//		cf4.put('p', null);
//		cf4.put(null, 4.23f);
//		cf4.put(null, 5.23f);
//		cf4.put(null, null);
		System.out.println(cf4);

		System.out.println();
		cf2.putAll(cf4);
		System.out.println(cf2);

		Set<Entry<Character, Float>> entrySet = cf.entrySet();
		for (Entry<Character, Float> entry : entrySet) {
			System.out.println(entry);
		}

	}
}
