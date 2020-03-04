/**
 * Define a class name "Swapper" which contains public static void method name swap() in which two integer are receive as parameter
 * and their value are swapped. Define another class name "SwaperTest" it contain main() method. In main method two integer variable
 * are created, initialized by some value are display, swap() method and swapper class are invoked and again they value are display. 
 * */
package com;

// taking a example of call by value
class Swapper {
	public static void swap(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
	}
}

public class SwaperTest {
	public static void main(String[] args) {
		int x = 5, y = 10;
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		Swapper.swap(x, y); // here value could not be swapped because its copy is created in the swap()
							// method
		System.out.println("After swapping...");
		System.out.println("A = " + x);
		System.out.println("B = " + y);
	}

}
