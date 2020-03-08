package com;
import java.nio.charset.Charset;
public class AvailableCharacterSet {

	public static void main(String[] args) {
		System.out.println("List of available charecterset..");
		for(String str:Charset.availableCharsets().keySet()) {
			System.out.println(str);
		}

	}

}
