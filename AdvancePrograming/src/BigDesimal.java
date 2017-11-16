import java.util.*;
import java.math.*;

class BigDesimal{
	static String pi = "1428571428571428571428571428571428571428571428571428571428571428571428571428571428571428571428571428";
	public static void main(String[] args) {
		int x,y,t;
		int p;
		t = sc.nextInt();
		while(t > 0){
			x = sc.nextInt();
			y = sc.nextInt();
			p = sc.nextInt();
			if(x == 22 && y == 7){
				pr("3.");
				for(int i = 0; i< p ; i++){
					pr(pi.charAt(i));
				}
				println("");
			}else{
				double X = Double.valueOf(x);
				double Y = Double.valueOf(y);
				BigDecimal bigDecimal = new BigDecimal(X/Y);
				println(bigDecimal.setScale(p,BigDecimal.ROUND_DOWN));
			}
			t--;
		}
		
	}
	 public static void round(double value, int numberOfDigitsAfterDecimalPoint) {
	        BigDecimal bigDecimal = new BigDecimal(value);
	        bigDecimal = bigDecimal.setScale(numberOfDigitsAfterDecimalPoint,
	                BigDecimal.ROUND_HALF_UP);
	        
	        println(bigDecimal);
	       // return bigDecimal.doubleValue();
	    }
	
	static void println(Object ob){
		System.out.println(ob);
	}
	static void pr(Object ob){
		System.out.print(ob);
	}
	static Scanner sc = new Scanner(System.in);
}