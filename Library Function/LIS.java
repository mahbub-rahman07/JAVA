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
		int arr[] = new int[]{10,22,9,33,21,50,41,60};
		
		System.out.println(LIS(arr));
		
	}
	
	// n2 solution
	public static long LIS(int[] arr){
		int len = arr.length;
		int[] lis = new int[len+1];
		Arrays.fill(lis,1);
		long maxVal =-9999;
		for(int i = 1; i < len ; i++){
			for(int j = 0; j < i ;j++ ){
				if(arr[i] > arr[j]){
					lis[i] = Math.max(lis[i], lis[j]+1);
					maxVal = Math.max(lis[i],maxVal);
				}
			}
		}
		//Arrays.sort(lis);
		//return lis[len];
		return maxVal;
		
	}
	
	
	
}