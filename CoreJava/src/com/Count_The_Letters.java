/**
 * Write a Java program to count the letters, spaces, numbers and other characters of an input string.

 * Test Data:
 * The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
 * */
package com;

public class Count_The_Letters {

	public static void main(String[] args) {
		String str = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		count(str);

	}
	public static void count(String x) {
		char[] ch =x.toCharArray();
		int letters = 0;
		int space = 0;
		int num = 0;
		int otherChar = 0;
		for (int i = 0; i < x.length(); i++) {
			if(Character.isLetter(ch[i])) {
				letters++;
			}else if(Character.isDigit(ch[i])) {
				num++;
			}else if(Character.isSpace(ch[i])){
				space++;
			}else {
				otherChar++;
			}
			
		}
		System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
		System.out.println("letter: " + letters);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + otherChar);
	}

}
