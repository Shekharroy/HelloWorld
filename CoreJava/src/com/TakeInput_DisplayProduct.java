package com;
/**
 * Write a Java program that takes two numbers as input and display the product of two numbers.
 * Test Data:
 * Input first number: 25
 * Input second number: 5
 * Expected Output :
 * 25 x 5 = 125
 * 
 * **/
import java.util.Scanner;
public class TakeInput_DisplayProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first_Number;
		int second_Number;
		System.out.print("Enter The First Number = ");
		first_Number = sc.nextInt();
		System.out.print("Enter The Second Number = ");
		second_Number = sc.nextInt();
		// taking third variable for the result of product;
		int result = (first_Number * second_Number);
		System.out.println("\n Display the output of the product of two number which is taken by user = "+result);
		// Expected output as it is below:
		System.out.println("*******Expected output as it is below******");
		System.out.println(first_Number+ " x " +second_Number+" = "+result);

	}

}
