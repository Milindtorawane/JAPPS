package com.japps.collections;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * The SortedSet interface extends Set and declares the behavior of a set sorted
 * in an ascending order. In addition to those methods defined by Set, the
 * SortedSet interface declares the methods summarized in the following table −
 * 
 * Several methods throw a NoSuchElementException when no items are contained in
 * the invoking set. A ClassCastException is thrown when an object is
 * incompatible with the elements in a set.
 * 
 * A NullPointerException is thrown if an attempt is made to use a null object
 * and null is not allowed in the set.
 * 
 * 
 */

public class SortedSetDemo {
	
	public static void main(String[]args){
		
		SortedSet<String> s=new TreeSet<String>();
		s.add("China");
		s.add("Zimbave");
		s.add("Argentina");
		
		for(String cName:s){
			System.out.println(cName);
			
		}
	
		
		SortedSet<Integer> num=new TreeSet<Integer>();
		num.add(101);
		num.add(102);
		num.add(103);
		num.add(104);
		num.add(105);
		
		System.out.println("First number is>"+num.first());
		System.out.println("last number is>"+num.last());
		System.out.println("Headset number is>"+num.headSet(103));
		System.out.println("tailset number is>"+num.tailSet(103));
		System.out.println("Subset number is>"+num.subSet(102,104));
		
		//Comparator returns comparator object  
		//To know the underlying sorting technique (ascending order)
		//if the default sorting is there then it returns null
		System.out.println("Comparator");
		
	
	}
}
