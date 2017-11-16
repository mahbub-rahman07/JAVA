import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.time.LocalDate;
class Solution {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		HashMap<String,String> emp = new HashMap<String,String>();
		String name;
		String phone;
		
		while(n > 0){
			name = sc.nextLine();
			phone = sc.nextLine();
			
			emp.put(name, phone);
			
			n--;
			//System.out.println(n);
		}
		
		for(Map.Entry m : emp.entrySet()){
			System.out.println("Key : "+m.getKey() +" -> Value : "+m.getValue());
		}
		
		
		while (sc.hasNext()) {
			name = sc.nextLine();
			if(emp.get(name) == null){
				System.out.println("Not found");
			}else{
				System.out.println(name+"="+emp.get(name));
			}
						
		}
		
		
	}
}