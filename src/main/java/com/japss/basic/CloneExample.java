package com.japss.basic;

import java.io.Serializable;

public class CloneExample implements Serializable 
	{ 
	    
	    String name = "GeeksForGeeks"; 
	  
	    public static void main(String[] args)
	    
	    { 
	        CloneExample obj1 = new CloneExample(); 
	        try
	        { 
	            CloneExample obj2 = (CloneExample) obj1.clone(); 
	            System.out.println(obj2.name); 
	        } 
	        catch (CloneNotSupportedException e) 
	        { 
	            e.printStackTrace(); 
	        } 
	    } 
	} 
	


