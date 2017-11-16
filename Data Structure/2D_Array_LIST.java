import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.time.LocalDate;
import java.awt.*;

class Solution {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		n = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>(n);  
		while(n > 0){
			int len = sc.nextInt();
			ArrayList<Integer> temp = new ArrayList<Integer>();
			
			for(int i = 0; i < len ;i++){
				temp.add(sc.nextInt());
			}
			listOfLists.add(temp);
			
			n--;
		}
		int cas = sc.nextInt();
		while(cas > 0){
			int x,y;
			x = sc.nextInt();
			y = sc.nextInt();
			
			try {
				System.out.println(listOfLists.get(x-1).get(y-1));
			} catch (Exception e) {
				System.out.println("ERROR!");
			}
			
			
			cas--;
		}
		
	
	}
}