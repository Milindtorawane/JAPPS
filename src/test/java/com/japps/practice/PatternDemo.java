package com.japps.practice;

public class PatternDemo {

	public static void main(String[] args) {
		// leftTrianle();
		// rightTrianle();
		// UpwardPyramid
		// upwardPiryamid();
		downwardPiramid();

	}

	private static void downwardPiramid() {
		// int rows = 5;      
		    for (int i= 1; i<=5 ; i++)
		    {
		        for (int j=1; j<=i; j++)
		        {
		            System.out.print(j);
		        }
		        for (int k=1; k<=5-i; k++)
		        {
		            System.out.print("*"+" ");
		        }
		        System.out.println();
		    }

	}

	void m1() {

	}

	public static void upwardPiryamid() {

		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k < (2 * i); k++) {
				System.out.print("*");
			}

			System.out.println(" ");
		}

	}

	public static void rightTrianle() {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= (5 - i); j++) {

				System.out.print(" ");

			}

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	public static void leftTrianle() {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");

		}
	}
}