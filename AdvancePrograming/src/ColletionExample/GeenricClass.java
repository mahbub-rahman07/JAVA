package ColletionExample;

import java.util.ArrayList;
import java.util.List;


public class GeenricClass {

	public static void main(String[] args) {
		 Integer[] intArray = { 1, 2, 3, 4, 5 };
	     Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	     Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
	     List<String> Names = new ArrayList<String>();
	     Names.add("Mahbub");
	     Names.add("Martin");
	     Names.add("Santa");
	     
	     
	    printAll(intArray);
	    printAll(doubleArray);
	    printAll(charArray);
	    System.out.println(maximum("Apple", "Aanar", "banana"));
	    System.out.println(maximum(1.22,3.11,0.11));
	    System.out.println(maximum(1,2,3));
	    

	}
	 public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	      T max = x;   // assume x is initially the largest
	      
	      if(y.compareTo(max) > 0) {
	         max = y;   // y is the largest so far
	      }
	      
	      if(z.compareTo(max) > 0) {
	         max = z;   // z is the largest now                 
	      }
	      return max;   // returns the largest object   
	   }
	   
	public static <E> void printAll(E[] inputs) {
		for(E e : inputs){
			System.out.print(e);
			System.out.print(" ");
		}
		System.out.println("");
	}
}
