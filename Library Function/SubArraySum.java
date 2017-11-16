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
		
		int arr[] = new int[n];
		int negCont = 0;
		for(int i=0; i < n; i++){			
			arr[i] = sc.nextInt();
			
		}
		
			for(int i=0; i < n; i++){		
				long sum = 0;	
				for(int j = i; j < n; j++){
					sum = arr[j]+sum;
					if(sum < 0){
						negCont++;
					}
				}
				
			}
		
		System.out.println(negCont);
	}
}