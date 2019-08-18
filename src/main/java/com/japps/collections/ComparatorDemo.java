package com.japps.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.apache.poi.util.SystemOutLogger;
/**
 * 
 * Purpose: Sort the number based on last digit ascending
 * 
 * 
 *
 */


public class ComparatorDemo {
	
	
	public static void main(String[]args){
		ArrayList<Integer>numlist=new ArrayList<Integer>();
		numlist.add(305);
		numlist.add(998);
		numlist.add(774);
		numlist.add(236);
		/*
		Collections.sort(numlist);
		System.out.println(numlist);
		Collections.reverse(numlist);
		System.out.println(numlist);
		*/
		
		ComparatorTest com=new ComparatorTest();
		Collections.sort(numlist,com);
		
		Collections.reverseOrder();
		System.out.println(numlist);
	}

	

	

}
