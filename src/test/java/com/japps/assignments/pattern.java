package com.japps.assignments;

public class pattern {

	public static void main(String[] args) {

		pattern obj = new pattern();
		// LeftPattern();
		//start();
		//triangle();
		reverseTriangle();
	}

	
	public static void triangle() {
		int i, j, k;
		for (i = 1; i <= 3; i++) {
			for (j = 3; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k < (i*2); k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void reverseTriangle() {
		int i, j, k;
		for (i = 3; i >= 1; i--) {
			for (j = 3; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k < (2*i); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void LeftPattern() {
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" *");

			}
			System.out.println();
		}
	}

}
