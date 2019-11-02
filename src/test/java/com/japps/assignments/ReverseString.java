package com.japps.assignments;

public class ReverseString {


	public static void main(String[]args)

	{
		//reversStringWithStringBuffer();
		//reverstring();
		System.out.println(reverseString("Milind"));
//		String str="ABCD";
//		System.out.println(str.substring(1));
//		System.out.println(str.charAt(0));
	}
	
	
	public static void reversStringWithStringBuffer(){
		String Name="Milind";
		StringBuilder sb= new StringBuilder(Name);
		System.out.println(sb.reverse());;		
		
	}
	
	public static void reverstring(){
		String Name="Milind";
		char[]abc=Name.toCharArray();
		int len=abc.length;
		System.out.println(len);
		String rev="";
		for(int i=len-1;i>=0;i--){  
			rev=rev+abc[i];  
			System.out.println(rev);

		}

		System.out.println(rev);

	}
	
	 public static String reverseString(String string)
	    {
	        if (string.isEmpty()){
	         return string;
	        }
	        //Calling function recursively
	        System.out.println("substring>>"+string.substring(1));
	        System.out.println("chart>>"+string.charAt(0));
	        
	        return reverseString(string.substring(1)) + string.charAt(0);
	        
	    }

}
