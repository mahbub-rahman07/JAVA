class Untitled {
	public static void main(String[] args) {
		String[] s = {"APPLE","BANANA","PUMKIN","LICCHI"};
		printme(s);
		print(s[1]);
	}
	
	public static <T> void printme(T[] ob){
		
		for(T y : ob)
			System.out.printf("%s ",y);
		System.out.println();
	}
	public  static void print(Object ob){
		System.out.print(ob);
	}
	public  static void println(Object ob){
		System.out.println(ob);
	}

}