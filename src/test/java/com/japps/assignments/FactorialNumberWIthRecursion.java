package com.japps.assignments;

public class FactorialNumberWIthRecursion {

	public static void main(String args[]) {
		int num = 5;
		int fact = 1;
		// It is the number to calculate factorial
		fact = factorial(num);
		System.out.println("Factorial of " + num + " is: " + fact);
	}

	static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n * factorial(n - 1));
		}
	}

}
