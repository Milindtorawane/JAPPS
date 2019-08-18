package com.japps.assignments;

/**
 * @author Milind.Torawane
 * 
 *         153
 *
 */

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 153;
		int rem;

		int sum = 0;
		while (num > 0) {

			rem = num % 10;
			System.out.println(rem);
			sum = sum + (rem * rem * rem);
			num = num / 10;
			System.out.println(num);
		}

		System.out.println(sum);
	}

}
