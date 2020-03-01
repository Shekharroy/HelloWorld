package com;
/**
 * Write a Java program that takes a number as input and prints its multiplication table upto 10.
 * Expected Output :
 * 8 x 1 = 8
 * .....
 * 8 x 10 = 80
 * */
import java.util.Scanner;
public class Table {
	public static void main(String arr[]) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("Enter the input value of number = ");
		number = sc.nextInt();
		for(int i = 1; i <= 10; i++) {
			System.out.println(number+ " x "+i+ " = "+(number*i));
		}
	}

}
