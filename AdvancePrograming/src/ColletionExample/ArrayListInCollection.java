package ColletionExample;

import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListInCollection {

	public static void main(String[] args) {
		ArrayList<Integer> Number = new ArrayList<Integer>();
		Number.add(10);
		Number.add(20);
		Number.add(55);
		List<Integer> Num = new ArrayList<Integer>();
		Num.add(10);
		Num.add(30);
		System.out.println();
		for(int i = 0; i< Number.size() ; i++){
			System.out.println(Number.get(i));
		}
		// Create a Iterator ....
		
		Number.retainAll(Num); // keeping only that same in Num
		Iterator<Integer> it = Number.iterator();
		System.out.println("Iterator...");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Number.removeAll(Num); // all same element in Num from Number
		Number.addAll(Num); // adding all number from Num in Number
		// remove item
		
		Number.remove(0); // its very slow remove from bigening or middle
		Number.remove(Number.size()-1); // its much faster remove from last
		System.out.println("For ench loop ");
		for(Integer nInteger : Number){
			System.out.println(nInteger);
		}
		Num.add(0,30); // adding element in begining  
		Num.set(2, 40); // Num[2] = 40;
		Collections.sort(Num); // sorting ArrayList
		System.out.println(Num); // printing al elements in Num;
		
	}

}
