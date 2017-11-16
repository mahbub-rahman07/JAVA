import java.util.*;

class Untitled {
	public static void main(String[] args) {
		String str = "pow123llp";
		System.out.println("before : "+str);
		
		str = str.replaceAll("[a-zA-Z]", ""); // TThis function will remove perticular word from string
		
		System.out.println("After : "+str);
		
		str = "pow123llp";
		System.out.println("before : "+str);
		
		str = str.replaceAll("[^a-zA-Z]", ""); 	
		System.out.println("After : "+str);
		
	}
}