/**
 * Write a Java program to compare two numbers.
 * */
package com;
import java.util.Scanner;
public class CompareTwoNum {
	public static void main(String arr[]) {
		Scanner in = new Scanner(System.in);
		
		int fNum, secNum;
		System.out.print("Inter first number = ");
		fNum = in.nextInt();
		System.out.print("Inter second number = ");
		secNum = in.nextInt();
		if(fNum == secNum) {
			System.out.println("The number are equals...");
			System.out.printf("%d == %d\n", fNum, secNum);
		}
		if(fNum > secNum) {
			System.out.println("First number is greater then second...");
			System.out.printf("%d > %d\n", fNum, secNum);
		}
		if(fNum < secNum ) {
			System.out.println("First number lessthan second number...");
			System.out.printf("%d < %d\n", fNum, secNum);
		}
		if(fNum != secNum) {
			System.out.println("first number is not equal to second number..");
			System.out.printf("%d != %d\n", fNum, secNum);
		}
		if(fNum <= secNum) {
			System.out.println("First number is less than or equal to second number...");
			System.out.printf("%d <= %d\n", fNum, secNum);
		}
		if (fNum >= secNum) {
			System.out.println("First number is greater than or equal to second number...");
			System.out.printf("%d >= %d",fNum, secNum );
		}
		
	}

}
