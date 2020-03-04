/**
 * Write a Java program to multiply two binary numbers.

 *In digital electronics and mathematics, a binary number is a number expressed in the base-2 numeral system or binary numeral system. This   *system uses only two symbols: typically 1 (one) and 0 (zero).
 * */
package com;
import java.util.Scanner;
public class MultiplyTwoBinaryNumber {
	public static void main(String arr[]) {
		long binary1, binary2, multiply = 0;
		int digit, factor = 1;
		Scanner in = new Scanner(System.in);
		System.out.print("Input the first binary number: ");
		binary1 = in.nextLong();
		System.out.print("Input the second binary number: ");
		binary2 = in.nextLong();
		while(binary2 !=0) {
			digit =(int) (binary2 % 10);
			if(digit == 1) {
				binary1 = binary1 * factor;
				multiply = binaryproduct((int)binary1, (int)multiply);
			}else {
				binary1 = binary1 * factor;
			}
			binary2 = binary2 / 10;
			factor = 10;
		}
		System.out.print("product of two binary number: "+multiply+ "\n");
	}
	static int binaryproduct (int binary1, int binary2) {
		int i = 0, remainder = 0;
		int[] sum = new int[20];
		int binary_product_result = 0;
		while(binary1 !=0 || binary2 !=0) {
			sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
			remainder = (binary1 % 10 + binary2 % 10 +remainder) / 2;
			binary1 = binary1 / 10;
			binary2 = binary2 / 10;
		}
		if(remainder !=0) {
			sum[i++] = remainder;
		}
		--i;
		while (i >= 0) {
			binary_product_result = binary_product_result * 10 + sum[i--];
		}
		
		return binary_product_result;
	}

}
