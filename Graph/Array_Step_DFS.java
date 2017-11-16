import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.time.LocalDate;
class Solution {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		n = sc.nextInt();
		
		while(n > 0){
			int len = sc.nextInt();
			int leap = sc.nextInt();
			
			int[] arr = new int[len+5];
			
			for(int i = 0; i < len ;i++){
				arr[i] = sc.nextInt();
			}
			boolean t = isSol(arr, len,leap, 0);
		
			if(!t){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
			
			n--;
		}
	}
	
	public static boolean isSol(int[] arr ,int len, int leap , int i){
		if(i < 0 || arr[i] == 1) return false;
		else if(i == len-1 || i+leap >= len ){
			return true;
		}
		arr[i] = 1; // mark this step 
		return isSol(arr, len, leap, i+leap)||
				isSol(arr, len, leap, i+1)||
				isSol(arr, len, leap, i-1);
				
	}
}