/** 
 * Same Question but using call by reference......
 * 
 * 
 * Q:: Define a class name "Swapper" which contains public static void method name swap() in which two integer are receive as parameter 
 * and their value are swapped. Define another class name "SwaperTest" it contain main() method. In main method two integer variable 
 * are created, initialized by some value are display, swap() method and swapper class are invoked and again they value are display.  
 * */

package com;

import javax.sound.midi.Soundbank;

class Number {
	int value;

	public Number(int z) {// create parameterize constructor for initialization;
		value = z;
	}
}

class Swaper {
	public static void swap(Number a, Number b) {// take two reference variable which return type is Number
		int temp;

		temp = a.value; // here reference of a is store in temp;
		a.value = b.value; // here reference of b is store in a
		b.value = temp; // here reference of a is store in b
	}
}

public class SwaperTest2ExmCallRef {

	public static void main(String[] args) {
		// create object of Number class;
		Number a1 = new Number(5);
		Number a2 = new Number(10);

		System.out.println("Before swaoing...");
		System.out.print("The value of a = " + a1.value + "\n");
		System.out.print("The value of b = " + a2.value + "\n");

		Swaper.swap(a1, a2);// swap() method is static that's call with class name;
		System.out.println(" ******* After Swapping ******* ");
		System.out.print("The value of a = " + a1.value + "\n");
		System.out.print("The value of b = " + a2.value + "\n");

	}

}
