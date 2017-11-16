import java.util.*;

class Hashset {
	public static void main(String[] args) {
		//Set<String>s = new HashSet<String>(); // follow ordering
		//Set<String>s = new LinkedHashSet<String>(); // dont follow ordering 
		Set<String>s = new TreeSet<String>(); //  follow natural ordering 
		
		s.add("dog");
		s.add("cat");
		s.add("beer");
		s.add("cock");
		
		s.add("beer"); // its already entered
		
	//	System.out.println(s); 
	
	
		if(s.contains("Dog")){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	
		for(String key : s){
			System.out.println(key);
		}
	}
}