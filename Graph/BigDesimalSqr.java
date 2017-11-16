import java.util.*;
import java.math.*;
import java.text.*;

class Main {
	public static BigDecimal Mysqr(BigDecimal n)
	{
		BigDecimal low,high,mid;
		mid = BigDecimal.valueOf(0);
		low = BigDecimal.valueOf(0);
		high = n;
		int c = high.subtract(low).compareTo(BigDecimal.valueOf(0.9));
		while (c > 0) {
			mid = low.add(high).divide(BigDecimal.valueOf(2.0));
			int r = mid.multiply(mid).compareTo(n);
			if(r > 0){
				high = mid;
			}else{
				low = mid;
			}
			c = high.subtract(low).compareTo(BigDecimal.valueOf(0.9));
		}
		return mid;
		
	}
	public static void main(String[] args) {
		BigDecimal n;
		DecimalFormat df = new DecimalFormat("####");
		int tc;
		tc = sc.nextInt();
		while (tc > 0) {
			n = sc.nextBigDecimal();
			
			System.out.println(df.format(Mysqr(n)));
			println("");
			tc--;
			
			//System.out.println(df.fomat(Mysqr(BigDecimal.valueOf(n))));
			//println(Mysqr(BigDecimal.valueOf(n)));
		}
	}
	static void println(Object ob){
		System.out.println(ob);
	}
	static void pr(Object ob){
		System.out.print(ob);
	}
	static Scanner sc = new Scanner(System.in);
}