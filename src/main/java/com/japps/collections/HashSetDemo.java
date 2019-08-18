package com.japps.collections;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Insertion order is not preserved 
 * Duplicates are not allowed 
 * Can insert only one null value 
 * 
 * 
 */

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> h = new HashSet<String>();
		h.add("India");
		h.add("China");
		h.add("Japan");
		
		//Print all the values from handset
		Iterator<String> i = h.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}

		

	}

}
