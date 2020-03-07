/**
 * Write a Java program to compute the distance between two points on the surface of earth.

 * Distance between the two points [ (x1,y1) & (x2,y2)]
 * d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
 * Radius of the earth r = 6371.01 Kilometers
 * Expected output:
 * Input the latitude of coordinate 1 = 25
 * Input the longitude of coordinate 1 = 35
 * Input the latitude of coordinate 2 = 52.5
 * Input the longitude of coordinate 2 = 35.5
 * Distance b/w two point of earth surface = 3058.15512920181
 * */
package com;

import java.util.Scanner;

public class DistanceBitweenEarthArc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the latitude of coordinate 1 = ");
		double lat1 = sc.nextDouble();
		System.out.print("Input the longitude of coordinate 1 = ");
		double lon1 = sc.nextDouble();
		System.out.print("Input the latitude of coordinate 2 = ");
		double lat2 = sc.nextDouble();
		System.out.print("Input the longitude of coordinate 2 = ");
		double lon2 = sc.nextDouble();
		System.out.print("Distance b/w two point of earth surface = " + distanceBiteenTwoPoint(lat1, lon1, lat2, lon2));

	}

	public static double distanceBiteenTwoPoint(double lat1, double lon1, double lat2, double lon2) {
		lat1 = Math.toRadians(lat1);
		lon1 = Math.toRadians(lon1);
		lat2 = Math.toRadians(lat2);
		lon2 = Math.toRadians(lon2);
		double radiusE = 6371.01;// kilometer
		return radiusE
				* Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

	}
}
