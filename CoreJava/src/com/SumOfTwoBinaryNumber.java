/**
 * Write a Java program to add two binary numbers.

 *In digital electronics and mathematics, a binary number is a number expressed in the base-2 numeral system or binary numeral system. This     *system uses only two symbols: typically 1 (one) and 0 (zero).
 */
package com;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class SumOfTwoBinaryNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long binary1, binary2;
		int i = 0, remainder = 0;
		int sum[] = new int[20];

		System.out.print("Enter the value of binary1 = ");
		binary1 = sc.nextLong();
		System.out.print("Enter the value of binary2 = ");
		binary2 = sc.nextLong();
		// addition of binary number
		while (binary1 != 0 || binary2 != 0) {
			sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
			remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
			binary1 = binary1 / 10;
			binary2 = binary2 / 10;
		}

		if (remainder != 0) {
			sum[i++] = remainder;
		}
		--i;

		System.out.print("Sum of two binary number: ");
		while (i >= 0) {
			System.out.print(sum[i--]);
		}
		System.out.println("");
	}

}
