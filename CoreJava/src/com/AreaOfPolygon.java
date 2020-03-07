package com;

import java.util.Scanner;

public class AreaOfPolygon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of side of polygon = ");
		int n = sc.nextInt();
		System.out.print("Enter the length of plogon side = ");
		double lgth = sc.nextDouble();

		System.out.print("Area of Polygon = "+areaOfPolygon(n, lgth));

	}
	public static double areaOfPolygon(int ns,double side) {
		return(ns*(side*side)/(4*(Math.tan(Math.PI/ns))));
	}

}
