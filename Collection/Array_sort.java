
import java.util.Scanner;
import java.util.Arrays;

public class Array_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		long[] arr = new long[n+2];
		long sum = 0;
		
		
		for(int i=0;i<n;i++){
			
			arr[i] = sc.nextLong();
			
		}
		
		Arrays.sort(arr);
		
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		

	}

}
