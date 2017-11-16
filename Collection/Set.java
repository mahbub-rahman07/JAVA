import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.time.LocalDate;
class Solution {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		HashSet<String> myset = new HashSet<String>(); // keep data uniq and sorted 
		TreeSet<String> myset2 = new TreeSet<String>(); // keep all same data and keep sorted order
		String names;
		while(n >0){
			names = sc.nextLine();
			
			myset.add(names);
			myset2.add(names);
			
			System.out.println(myset.size());
			
			n--;
		}
		
		
		for(String s : myset2){
			System.out.println(s);
		}
	}
}