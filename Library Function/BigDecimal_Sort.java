import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.time.LocalDate;
class Solution {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int tc;
		tc = sc.nextInt();
		String[] s = new String[tc+3];
		String bg;
		for(int i = 0; i < tc; i++){
			s[i] = sc.next();
		}
		Arrays.sort(s, new Comparator<String>() {
			    @Override
			    public int compare(String o1, String o2) {
				if (o1 == null || o2 == null) {
				    return 0;
				}
				BigDecimal o1bd = new BigDecimal(o1);
				BigDecimal o2bd = new BigDecimal(o2);
				return o2bd.compareTo(o1bd);
			    }
			});
		for(int i = 0; i < tc; i++){
			System.out.println(s[i]);
		}
	}
}