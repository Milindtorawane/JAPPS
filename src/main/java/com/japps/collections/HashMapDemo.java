package com.japps.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	
	public static void main(String[]args){
		
		
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();    
	    System.out.println("Initial list of elements: "+hm);  
	      hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul"); 
	     
	       
	      System.out.println("After invoking put() method ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }  
		
	}

}
