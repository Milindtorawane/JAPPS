package com.japps.oops;

 class PolymorphismClass {
	
	
	
		
		public static void main(String[] args) {
			
			ChildClass obj= new ChildClass();
			obj.method(); //call the child class method
			
			ParentClass obj2= new ChildClass();
			obj2.method(); //call the child class method
			obj2.method3();
			
			
			ParentClass obj3= new ParentClass();
			
		}
		
		
	}

