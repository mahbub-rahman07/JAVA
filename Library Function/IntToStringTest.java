package com.javacodegeeks.javabasics.inttostring;

import java.util.IllegalFormatException;

public class IntToStringTest {

	public static void main(String args[]) {
		int mainInt = 123456789;
		
		// add + operator
		String string1 = "" + mainInt;
		System.out.println("With + operator: string1 = " + string1);
		
		// into the "" string
		String string2 = "123";
		System.out.println("Directly in the String: string2 = " + string2);
		
		// use Integer.toString() with and without radix
		String string3 = Integer.toString(mainInt);
		String string4 = Integer.toString(mainInt, 16);
		System.out.println("With toString method: string3(10 base system) = " + string3 +
						 	", string4(16 base system) = " +string4);
		
		// String.valueOf() method
		String string5 = String.valueOf(mainInt);
		System.out.println("With valueOf method: string5 = " + string5);
		
		try{
			// use format() method
			String string6 = String.format("%d", mainInt);
			System.out.println("With format method: string6 = " + string6);
		
		} catch(IllegalFormatException e1) {
			System.err.println("IllegalFormatException: "+ e1.getMessage());
		} catch(NullPointerException e2) {
			System.err.println("NullPointerException: "+ e2.getMessage());
		}
		
		// StringBuilder instance
		StringBuilder sb = new StringBuilder();
		sb.append(mainInt);
		String string7 = sb.toString();
		
		System.out.println("With StringBuilter class: string7 = " + string7);
		
	}
}
