import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.time.LocalDate;
class Solution {
	
	public static void main( String args[] ) {
		Printer myPrinter = new Printer();
		Integer[] intArray = { 1, 2, 3 };
		String[] stringArray = {"Hello", "World"};
		myPrinter.printArray(intArray);
		myPrinter.printArray(stringArray);
			  
	}
}
class Printer<T>{	
		 
		public void printArray(T[] mylist){
			for(int i = 0; i< mylist.length ; i++)
				System.out.println(mylist[i]);
		}	
	}
