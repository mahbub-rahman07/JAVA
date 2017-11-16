class Untitled {
	public static void main(String[] args) {
		String[] words = {"AB","BX","XC","AC"};
		
		for(String w : words){
			if(w.startsWith("X") || w.endsWith("X")){ // Start and end with 
				w = w.replace('X', 'A'); 				// replace with perticular character 
				System.out.println(w);
			}
		}
		
		String s = "Helloworldiammahbub";
		
		String b = "     Hello   ";
		
		System.out.println(s.indexOf("ma"));
		System.out.println(s.indexOf('a',13));
		
		
		System.out.println(b.trim());
		
	}
}