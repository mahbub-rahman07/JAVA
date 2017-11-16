import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.time.LocalDate;
class Solution {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int arr[][] = new int[6][6];
		for(int i=0; i < 6; i++){
			for(int j=0; j < 6; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		long sum = 0;
		long msum = -100;
		
		for(int i=0; i <=3; i++){
			for(int k = 0; k < 4;k++){
				int c = 0;
				sum = 0;
				for(int j = k; j < k+3; j++){
					if(c%2 == 0){
						sum += arr[i][j]+arr[i+2][j];
					}else{
						sum += arr[i][j]+arr[i+1][j]+arr[i+2][j];
					}
					c++;
				}
				msum = Math.max(sum, msum);
			}
		
		}
		System.out.println(msum);
			
	}
}
/*
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

ans = 7
*/