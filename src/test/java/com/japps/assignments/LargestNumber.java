package com.japps.assignments;

public class LargestNumber {
	
	public static void main(String[] args) {

		int myArray[] = { 5, 3, 8, 1 };
		int temp;
		int n = myArray.length;

		System.out.println("Array length>>"+myArray.length);

		for (int i = 0; i < n; i++) {

			for (int j = 1; j < (n - i); j++) {
				if (myArray[j - 1] < myArray[j]) {
					temp = myArray[j - 1];
					myArray[j - 1] = myArray[j];
					myArray[j] = temp;

				}

			}
		}
		
		System.out.println("largest Number>>"+myArray[0]);
		// Print the array
		for (int j = 0; j < myArray.length; j++) {
			System.out.println(myArray[j]);
		}


	}
	
}
