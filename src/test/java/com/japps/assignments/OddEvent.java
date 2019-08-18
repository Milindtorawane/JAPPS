package com.japps.assignments;

import java.util.Scanner;

public class OddEvent {
	
	public static void main(String[] args) {
		
//		Scanner sc= new Scanner(System.in);
//		 int num=sc.nextInt();
		int num=25;
		 int rem=num%10;
		 
		 System.out.println(rem);
		 if(rem==0 && num!=0){
			 System.out.println("Nnumber is even");
		 }else{
			 System.out.println("Nnumber is odd");
		 }
		 
		
	}

}
