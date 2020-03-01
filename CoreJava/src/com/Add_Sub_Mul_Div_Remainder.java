package com;
/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 * */
import java.util.Scanner;
public class Add_Sub_Mul_Div_Remainder {
	public static void main(String arr[]) {
		Scanner in = new Scanner(System.in);
		int firstNum;
		int secondNum;
		System.out.print("Enter the first number = ");
		firstNum = in.nextInt();
		System.out.print("Enter the second number = ");
		secondNum = in.nextInt();
		System.out.println("**************************");
		System.out.println(firstNum+ " + "+secondNum+ " = "+(firstNum+secondNum));
		System.out.println(firstNum+ " - "+secondNum+ " = "+(firstNum-secondNum));
		System.out.println(firstNum+ " x "+secondNum+ " = "+(firstNum*secondNum));
		System.out.println(firstNum+ " / "+secondNum+ " = "+(firstNum/secondNum));
		System.out.println(firstNum+ " mod "+secondNum+ " = "+(firstNum%secondNum));
	}

}
