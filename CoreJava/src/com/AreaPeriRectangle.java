package com;
/**
 * Write a Java program to print the area and perimeter of a rectangle.
 */
 
import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class AreaPeriRectangle {
	public static void main(String arr[]) {
		Scanner sc = new Scanner(System.in);
		double length, breadth;
		System.out.print("Enter the length of rectangle = ");
		length = sc.nextDouble();
		System.out.print("Enter the breadth of rectangle = ");
		breadth = sc.nextDouble();
		double area, perimeter;
		area = length * breadth;
		System.out.println("Area of rectangle = "+area);
		perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of Rectangle = "+perimeter);
	}

}
