package com;
/*
 * Write a Java program that takes three numbers as input to calculate and print the average of the numbers
 * */
import java.util.Scanner;

public class AvgOfThreeNum {
	public static void main(String arr[]) {
		Scanner sc = new Scanner(System.in);
		int one, two, three;
		System.out.print("Enter first number = ");
		one = sc.nextInt();
		System.out.print("Enter second number = ");
		two = sc.nextInt();
		System.out.print("\nEnter third number = ");
		three = sc.nextInt();
		// for store avg value of these three number take one more variable;
		float sum, avg;
		// Average calculation form here
		sum = one + two +three;
		System.out.println("Sum of the three number = "+sum);
		avg = (one + two + three) / 3;
		System.out.println("Average of three number = "+avg);
	}

}
