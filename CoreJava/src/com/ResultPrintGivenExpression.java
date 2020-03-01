package com;
/**
 * Write a Java program to print the result of the following operations.
 * Test Data:
 * a. -5 + 8 * 6;
 * b. (55+9) % 9;
 * c. 20 + -3*5 / 8;
 * d. 5 + 15 / 3 * 2 - 8 % 3;
 * Expected output:
 * 43
 * 1
 * 19
 * 13
 * */

public class ResultPrintGivenExpression {

	public static void main(String[] args) {
	// first way two represent expected output;
		System.out.println(-5 + 8 * 6);
		System.out.println((55+9) % 9);
		System.out.println(20 + -3*5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		System.out.println("******************");
	// Second way two represent expected output;
		int a = -5 + 8 * 6;
		int b =  (55+9) % 9;
		int c = 20 + -3*5 / 8;
		int d =5 + 15 / 3 * 2 - 8 % 3;
		System.out.print(a+"\n" +b+ "\n" +c+"\n"+d);
	}

}
