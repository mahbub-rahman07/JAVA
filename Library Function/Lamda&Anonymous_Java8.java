import java.util.*;

class Untitled {
	
	
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(4,1,2,3,5);
		
//		li.add(21);
//		li.add(16);
//		li.add(32);
//		li.add(13);
		
		
		//Collections.sort(li,com); // sort using lamda expression
		Collections.sort(li, (o1 , o2)->{ // using anonymous  
					if(o1 > o2 ){
						return 1;
					}
					return -1;
				});
		
//		for(Integer i : li){
//			System.out.println(i);
//		}
		
		li.forEach(i->System.out.println(i));  // internal iteration output:
		//li.forEach(i->SumIt(i));  				// internal iteration using defined method
		li.forEach(i->System.out.println(SumIt(i)));
		Integer res = li.stream().map(i -> i*(i+1)/2 ).reduce( 0, (c,e) -> c+e ); //Function BinaryOperator BiFunction Interface Lambda
		Integer res2 = li.stream().filter(i -> i%2 == 0 ).reduce(  0,(c,e) -> c+e); // add only even numbers
		System.out.println(res+" "+res2);
		
		
	}
	
	
	static Comparator<Integer> com = (o1 , o2)->{ // lamda expression 
			if(o1 > o2 ){
				return 1;
			}
			return -1;
	};
		
	public static int SumIt(Integer i){
			//System.out.println( i*(i+1)/2);
			return ( i*(i+1)/2);
	}
}