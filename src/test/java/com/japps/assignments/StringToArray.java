package com.japps.assignments;

public class StringToArray {
	
	public static void main(String[] args) {
		
		StringToArray2();
		
			
	}
	
	public static void StringToArray2(){
		String str = "GeeksForGeeks";
		 char[] ch=str.toCharArray();
		System.out.println(	ch);
		for(char c:ch){
			System.out.println(c);
		}
	}
	
	
	
		public static void StringToArray1(){
			String str = "GeeksForGeeks";
			
			char [] ch= new char[str.length()];
			
			for(int i=0;i<str.length();i++){
			
			ch[i]=str.charAt(i);
		}

			for(char c:ch){
				System.out.println(c);
			}
			
		}
		
		
}
	
	

