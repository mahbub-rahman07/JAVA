import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.time.LocalDate;
class Solution {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s;
		
		while (sc.hasNext()) {
			s = sc.nextLine();
			
			System.out.println(solv(s));
		}
	}
	public static boolean solv(String s){
		Stack<Character> st = new Stack<Character>();
		
		for(int i = 0; i < s.length() ; i++){
			char c = s.charAt(i);
			if(c == '(' || c == '{' || c == '['){
				st.push(c);
			}else if(!st.empty()){
				char ch = st.pop();								
				if(matc(c,ch)){					
					return false;
				}
			}else{
				return false;
			}
			
		}
		if(st.empty())
			return true;
		
		return false;
		
			
	}
	public static boolean matc(char c,char ch){
		//System.out.println(c+" "+ch);
		if(c == '{' && ch == '}'){
			return true;
		}else if(c == '(' && ch == ')'){
			return true;
		}else if(c == '[' && ch == ']'){
			return true;
		}else{
			return false;
		}
	}
}