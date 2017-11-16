import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.time.LocalDate;
class Solution {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			list.add(sc.nextInt());
		}
		int cas =sc.nextInt();
		
		while(cas > 0){
			String com;
			int x,y;
			
			com = sc.next();
			
			
			if(com.equalsIgnoreCase("Insert")){
				x = sc.nextInt();
				y = sc.nextInt();
				list.add(x, y);
			}else{
				x = sc.nextInt();
				list.remove(x);
			}
			
			
			cas--;
		}
		for(Integer i : list){
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
}