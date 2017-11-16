class Sorting {
	public static void main(String[] args) {
		Integer[] array = {44,11,2,33,9,10,5};
		int[] arr = {44,11,2,33,9,10,5};
//		BubbleSort bSort = new BubbleSort(arr);
//		bSort.display("Before Bubble Sort");
//		bSort.Sort();
//		bSort.display("After Bubble Sort");
		
//		SelectionSort sSort = new SelectionSort(arr);
//		sSort.display("Before Selection Sort");
//		sSort.Sort();
//		sSort.display("After Selection Sort");
		
		
//		QuickSort qSort = new QuickSort(arr);
//		qSort.display("Before Quick Sort");
//		qSort.Sort();
//		qSort.display("After Quick Sort");
		
//		MargeSort mSort = new MargeSort(arr);
//		mSort.display("Before Marge Sort");
//		mSort.Sort();
//		mSort.display("After Marge Sort");
		
		HeapSort hSort = new HeapSort(array);
		hSort.display("Before Heap Sort");
		hSort.Sort();
		hSort.display("After Heap Sort");
	}
}


class BubbleSort{
	// Complexity O(n2)
	int[] arr;	
	public BubbleSort(int[] a){
		arr = new int[a.length];
		arr = a.clone();
	}
	
	public void Sort(){
		for(int i = 0; i < arr.length; i++){
			for(int j = 1; j < (arr.length-i) ; j++){
				if(arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	public void display(String msg){
		if(msg != null){
			System.out.println(msg);
		}
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}

class SelectionSort{
	// Complexity O(n2)
	int[] arr;	
	public SelectionSort(int[] a){
		arr = new int[a.length];
		arr = a.clone();
	}
	
	public void Sort(){
			for(int i = 0; i < arr.length-1; i++){
				int index = i;
				
				for(int j = i+1 ; j < arr.length ; j++){
					if(arr[j] < arr[index]){
						index = j;
					}
				}
				if(index != i){
					int temp = arr[index];
					arr[index] = arr[i];
					arr[i] = temp;
				}
				
			}
		}
	public void display(String msg){
		if(msg != null){
			System.out.println(msg);
		}
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}
class QuickSort{
	// Complexity O(n2)
	int[] arr;	
	public QuickSort(int[] a){
		arr = new int[a.length];
		arr = a.clone();
	}
	public void Sort(){				
		Sort(0,arr.length-1);			
	}
	public void Sort(int low,int high){
			
			if(low > high) return ;
			
			int mid = low+(high-low)/ 2;
			int pivot = arr[mid];
			int i = low;
			int j = high;			
		
			while (i <= j) {
				while (arr[i] < pivot) i++;
				while (arr[j] > pivot) j--;
					
				if(i <= j){					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					//display("\n in sort i: "+i+" j: "+j+" pivot: "+pivot+"\n");
					i++;
					j--;
					
				}
			}
			if(low < j){				
				Sort(low,j);				
			}
			if(high > i){				
				Sort(i,high);				
			}	
			
	}
	
	public void display(String msg){
		if(msg != null){
			System.out.println(msg);
		}
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}
class MargeSort{
	// Complexity O(nlogn) time
	// O(n) space 
	int[] arr;	
	int[] tempArr;
	
	public MargeSort(int[] a){
		arr = new int[a.length];
		tempArr = new int[a.length];
		arr = a.clone();
	}
	public void Sort(){				
		doDevide (0,arr.length-1);			
	}
	public void doDevide(int low,int high){		
		if(low < high){
			int mid = low + (high - low) / 2;
				
			doDevide(low, mid);
			doDevide(mid+1, high);
				
			margeSort(low, mid , high);
				
		}			
	}
	public void margeSort(int low, int mid , int high){
		//System.out.println("low :"+low+" high :"+high +" mid :"+mid);
		
		for(int i = low ; i <= high ; i++)
			tempArr[i] = arr[i];
		
		int i = low;
		int j = mid+1;
		int k = low;
		
		while (i <= mid && j <= high) {
			if(tempArr[i] <= tempArr[j]){
				arr[k] = tempArr[i];
				i++;
			}else{
				arr[k] = tempArr[j];
				j++;
			}
			k++;
		}
		while (i <=mid) {
			arr[k] = tempArr[i];
			i++;
			k++;
		}
		
	}
	
	public void display(String msg){
		if(msg != null){
			System.out.println(msg);
		}
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}
class HeapSort{
	// Complexity O(nlogn) time
	// O(1) space 
	Comparable[] arr;
	int totall;		
	
	public HeapSort(Integer[] a){
		arr = new Comparable[a.length];		
		arr = a.clone();
		totall = a.length-1;
	}
	public void Sort(){				
		sortFinal();			
	}
	public void heapify(int i){	
		int left = i*2;
		int right = i*2+1;
		int grt = i;
		
		if(left <= totall && arr[left].compareTo(arr[grt]) >= 0){
			grt = left;
		}	
		if(right <= totall && arr[right].compareTo(arr[grt]) >= 0){
			grt = right;
		}
		
		if(grt != i){
			swap(i,grt);
			//display("inner sort i: "+i +" grt: "+grt);
			heapify(grt);
		}	
					
	}
	public void swap(int i,int j){
		Comparable temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void sortFinal(){
		
		for(int i = totall/2; i >= 0 ;i--){
			heapify(i);
		}
		for(int i = totall ; i > 0 ; i--){
			swap(0, i);
			totall--;
			heapify(0);
		}
	}
	
	public void display(String msg){
		if(msg != null){
			System.out.println(msg);
		}
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}