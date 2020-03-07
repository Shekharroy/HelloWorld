package com;
import java.util.Scanner;
public class Sum_Of_The_Digit_Integer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the integer value = ");
		long n = sc.nextLong();
		System.out.println("Sum of digit = "+sumOfDigit(n));
		

	}
	public static int  sumOfDigit(long n) {
		int s = 0;
		while (n != 0) {// conditional loop
			System.out.println("n % 10 = "+n % 10);
			s += n % 10;// remainder;
			System.out.println("n /=10 = "+n / 10);
			n /=10;// Quotient;
		}
		return s;
	}

}
