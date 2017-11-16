class Untitled {
	public static void main(String[] args) {
		int Arr[] = {22,55,44,55,66};
		
		for(int i : Arr){
			System.out.print(i+" ");
		}
		
		System.out.println("\nAvarage is "+avarage(45,55,66,77));
	}
	public  static int avarage(int...numbers){
		
		int total =0;
		for(int x : numbers){
			total += x;
		}
		return total/numbers.length;
	}
}