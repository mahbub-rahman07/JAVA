package ColletionExample;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;;

public class LinkedListExample {
	public static void main(String ard[]) {
		//ArrayList<Integer> Number = new ArrayList<Integer>();
		//LinkedList<Integer> Number2 = new LinkedList<Integer>();
		// both are Inherited from List Class
		// so we can declare like below
		List<Integer> Number = new ArrayList<Integer>();
		List<Integer> Number2 = new LinkedList<Integer>();
		doIter("Array List", Number);
		doIter("Link List", Number2);
		
	}
	public static void doIter(String type,List<Integer> list) {
		
		for(int i = 0; i < 1E5 ; i++){
			list.add(i);
		}
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 1E5 ; i++){
			// remove from first 
			list.add(0,i);
		}
		long end = System.currentTimeMillis();
		System.out.println(type+" take "+(end-start) +" miliseconds");
		
	}
}
