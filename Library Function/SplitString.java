import java.io.*;
public class Test
{
	public static void main(String args[])
	{
		String Str = new String("Geeks-for-Geeks");
 
		// Split above string in at-most two strings  
		for (String val: Str.split("-", 2))
			System.out.println(val);
 
		System.out.println("");
   
		// Splits Str into all possible tokens 
		for (String val: Str.split("-"))
			System.out.println(val);
	}
}