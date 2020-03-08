/**
 * Write a Java program to reverse a string;
 * */
package com;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the string value = ");
		char[] chr = sc.nextLine().toCharArray();
		System.out.println("Tha char = " + chr.length);

		System.out.println("Reverse of string...");
		for (int i = chr.length - 1; i >= 0; i--) {
			System.out.print(chr[i]);
		}

	}

}
