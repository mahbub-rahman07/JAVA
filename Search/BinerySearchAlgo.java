import java.util.Arrays;
class BinerySearchAlgo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int size = arr.length;
		
		System.out.println("Number found at "+BinerySearch(arr,8,size-1));
		
	}
	
	public static int BinerySearch(int[] arr , int data, int end){
		Arrays.sort(arr);
		//for(Integer i : arr)System.out.println(i);
		int mid = 0;
		int start = 0;
		int counter = 1;
		while (start <= end) {
			mid = start+((end-start)/2);
			System.out.println(start+" "+end);
			//if(mid >= arr.length)break;
			if(arr[mid] == data ){
				System.out.println("Number of loop : "+counter);
				return mid+1;
			}else if(arr[mid] > data){
				end = mid-1;
			}else{
				start = mid+1;
			}
			counter++;
		}
		
		System.out.println("Not found after : "+counter+" try");
		return -1;
	}
}