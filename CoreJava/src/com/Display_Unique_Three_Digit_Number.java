/**
 * Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
 * */
package com;

public class Display_Unique_Three_Digit_Number {

	public static void main(String[] args) {
		int totalcount = 0;
		for(int i = 1; i <= 4; i++) {
//			System.out.println("The value of i = "+i);
//			System.out.println("");
			for(int j = 1; j <= 4; j++) {
//				System.out.println("The value of j = "+j);
//				System.out.println("");
				for(int k = 1; k <= 4; k++) {
//					System.out.println("The value of k = "+k);
//					System.out.println("");
					if(k != i && k != j && i != j) {
						totalcount++;
						System.out.println(i +"" +j+ "" +k);
					}
					
				}
			}
		}
		System.out.println("Total count = "+totalcount);

	}

}
