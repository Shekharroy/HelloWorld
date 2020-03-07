/**
 * Write a Java program to compute the area of a hexagon.
 * */
package com;

import java.util.Scanner;

public class AreaOfHexagon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the side of hexagon =");
		double side = sc.nextDouble();
		System.out.print("Area of Hexagon = "+hexagonArea(side));
	}
	public static double hexagonArea(double side) {
		return(6*(side*side)/(4*(Math.tan(Math.PI/6))));
	}

}
