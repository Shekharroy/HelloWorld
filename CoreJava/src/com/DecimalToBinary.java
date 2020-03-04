/**
 * Write a Java program to convert a decimal number to binary number.
 * */
package com;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		int dec_num, quot, i=1,j;
		int bin_num[] = new int[100];
		Scanner in = new Scanner(System.in);
		System.out.print("Input a decimal number: ");
		dec_num = in.nextInt();
		quot = dec_num;
		while(quot !=0) {
			System.out.println("quot % 2 = "+quot % 2);
			bin_num[i++] = quot % 2;
			System.out.println("quot/2 = "+quot/2);
			quot = quot/2;
		}
		System.out.print("Binary number is: ");
		for(j=i-1; j > 0 ; j--) {
			System.out.print(bin_num[j]);
		}
		System.out.println("");
	}

}
