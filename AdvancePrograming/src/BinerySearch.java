
public class BinerySearch {

	public static void main(String[] args) {
			System.out.println(Mysqrt(5.0));
			int[] a = {1,2,3,4,5,6};
			System.out.println("Found the number 10 in array is : "+MyBinerySearch(a, 10));
		
	}
	//** BinerySearch with Bisection  */
	public static double Mysqrt(double n)
	{
		double low ,high,mid = 0.0;
		low = 0.0;
		high = n;
		while(high - low > 0.00001){
			mid = (low+high)/2.0;
			//System.out.println(low +" " + high +" "+ mid*mid);
			if(high > mid*mid){
				high = mid;
			}else{
				low = mid;
			}
		}
		return mid;
		
	}
	public static boolean MyBinerySearch(int a[],int n)
	{
		int low,high,mid;
		low = 0;
		high = a.length;
		mid = 0;
		while(high - low > 1){
			mid = (low+high)/2;
			if(a[mid] == n){
				return true;
			}
			if(a[mid] > n){
				high = mid;
			}else{
				low = mid;
			}
		}
		return false;
		
	}
	

}
