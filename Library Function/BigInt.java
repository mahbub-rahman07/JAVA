import java.util.*;
import java.math.*;
import java.lang.*;

class Untitled {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		long p,q,a;
		double b;
		int t,n;
		t = sc.nextInt();
		
		while(sc.hasNext()) {
			if( t==0 ){
				break;
			}
			p = sc.nextLong();
			q = sc.nextLong();
			n = sc.nextInt();
			
			b = q-p;
			if(b%2 == 1)
				b = Math.ceil(Math.sqrt(b));
			else{
				b = Math.sqrt(b);

			}
			long d = (int)b;
			
			a = q/d;
			
			BigInteger A,B,MOD;
			A = BigInteger.valueOf(a);
			B = BigInteger.valueOf(d);
			//MOD = new BigInteger("18446744073709551616");
			
			System.out.println(A.pow(n).add(B.pow(n)));
			t--;
			
			
		}

	}
}