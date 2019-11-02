package com.japps.assignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CountTheCharInString {
	
	
	public static void main(String[] args) {
		countWithRegess();
		
	}
	
	public static void countWithRegess(){
		
		String str="MEEEEED";
		char ch='E';
		Matcher m= Pattern.compile(str.valueOf(ch)).matcher(str);
		
		int count=0;
		while(m.find()){
			
			count++;
			
		}
		
	System.out.println(count);
		
	}

}
