import java.util.*;

class Hashmap {
	public static void main(String[] args) {
		//HashMap<Integer,String>hmap = new HashMap<Integer,String>(); // follow ordering
		//Map<Integer,String>hmap = new LinkedHashMap<Integer,String>(); // dont follow ordering
		Map<Integer,String>hmap = new TreeMap<Integer,String>();       // // follow ordering
		
		hmap.put(1,"one");
		hmap.put(4,"four");
		hmap.put(3,"three");
		hmap.put(2,"two");
		
//		System.out.println(hmap.size());
//		System.out.println(hmap.get(2));

//		for(Map.Entry<Integer,String>entry : hmap.entrySet() ){
//			
//			int key = entry.getKey();
//			String value = entry.getValue();
//			
//			System.out.println(key+" : "+value);
//		}
		Show(hmap);
		
	}
	static void Show(Map<Integer,String>map){
		
		for(Integer key : map.keySet()){
			
			String value = map.get(key);
			
			System.out.println(key+" : "+value);
		}
		
	} 
	
}