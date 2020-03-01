package com;

import java.util.Scanner;

/**
 * Write a Java program to print the sum of two numbers. Go to the editor
 * Test Data:
 * 74 + 36
 * Expected Output :
 * 110
 * */
public class SumOfTwoNum {
	public static void main(String arr[]) {
		//one way of addition of two number;
		//variable here;
		int firstNum = 74;
		int secNum = 36;
		int sum=0;
		sum = firstNum + secNum;
		System.out.println("Sum of two number = "+ sum);
		// output like that
		// 74 + 36 = 110;
		System.out.println(firstNum+" + "+secNum+ " = "+(firstNum + secNum));
		
	}

}
