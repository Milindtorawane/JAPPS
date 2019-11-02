package com.japps.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumber {

	public static void main(String args[]) {
		withCollection();
	}

	public static void withCollection() {

		int array[] = { 120, 10, 25, 63, 96, 57 };

		List<Integer> list = new ArrayList<Integer>();
		for (int i : array) {
			list.add(i);
		}

		// printing the List
		System.out.println("List: " + list);
		
		Collections.sort(list);
	

		// getting minimum value
		// using min() method
		int minList = Collections.min(list);

		// getting maximum value
		// using max() method
		int maxList = Collections.max(list);

		// printing the minimum value
		System.out.println("Minimum value of list is: " + minList);

		// printing the maximum value
		System.out.println("Maximum value of list is: " + maxList);
	}

	public static void withArrays() {

		int array[] = { 120, 10, 25, 63, 96, 57 };
		Arrays.sort(array);
		System.out.println("sorted Array" + Arrays.toString(array));
		int smallestNum = array[0];
		System.out.println("smallest element is >" + smallestNum);
	}
}
