import java.util.Scanner;

class Substring {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String s1,s2;
			
			s1 = sc.next();
			s2 = sc.next();
			
			int pos=0,ans=0;
			
			while(true){
				int r = s1.indexOf(s2,pos);
				if(r == -1){
					break;
				}
				pos = r+s2.length();
				ans++;
				//System.out.println(r+" "+pos);
			}
			
		
			System.out.println(ans);
			
	}
	
}
