package com.japps.collections;

import java.util.Comparator;

public class ComparatorTest implements Comparator<Integer>{

	
	
	public int compare(Integer I1, Integer I2) {
		
		if(I1%10>I2%10){
			return -1;
		}
		return 1;
	}

}
