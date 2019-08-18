package com.japss.basic;

public class StringLiteralDemo {
	
	
	public static void main(String[] args) {
		
		String str="Milind";
		String str2="Milind";
		String str1= new String("Milind");
		System.out.println(str1.concat("aab"));
		System.out.println(str1);
		
		System.out.println(str2==str);
	}

}
