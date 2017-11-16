import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] s;
		String st;
		
		st = sc.nextLine();
		
		
		s = st.split(",");
		
		int sum = 0;
		String Nst = "";
		for(int i=0;i<s.length;i++){
			
			sum += Integer.parseInt(s[i]);
			Nst += s[i];
			//System.out.println(s[i]);
			
		}
		System.out.println(sum);
		System.out.println(Nst);
	}
}