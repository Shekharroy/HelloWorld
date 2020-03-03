//Write a Java program to swap two variables;
package com;
import java.util.Scanner;
public class SwapTwoVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, temp;
		System.out.println("Taking input from first number = ");
		a = sc.nextInt();
		System.out.println("Taking input from Second number = ");
		b = sc.nextInt();
		System.out.println("Before swapping a = "+a+ " and b "+b);
		//Swapping;
		temp = a;
		a  = b;
		b = temp;
		System.out.println("After swapping the value of A = "+a+ " and B = "+b);// but here we perform call by value
		

	}

}
