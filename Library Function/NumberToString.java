import java.util.*;

class Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		int res;
		res = a;
		//String s = Integer.toString(b);
		String s = ""+b;
		String reverse = new StringBuffer(s).reverse().toString();
		
		res += Integer.parseInt(reverse);
		
		System.out.println(res);
		
		
		
	}
}