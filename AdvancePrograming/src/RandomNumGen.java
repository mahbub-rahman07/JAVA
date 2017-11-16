import java.util.Scanner;

public class RandomNumGen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=5;i++){
			int rnum = (int)(10+ Math.random()*(20-10)) ; // Math.random() gives the value < 0   now we give limit;
														// it will generate a value between 20 - 10
			System.out.println(rnum);
		}
		
		for(int i=1;i<=5;i++){
			char ch = (char)('a'+Math.random()*('z'-'a'+1)); // generate a random character between a-z
			System.out.println(ch);
		}
		System.out.println("Generate A Character Between A-Z is : "+GenRandonNum('A', 'Z'));
		System.out.println("Generate A Character Between a-z is : "+GenRandonNum('a', 'z'));
		System.out.println("Generate A Character Between 0-9 is : "+GenRandonNum('0', '9'));
		System.out.println("Generate A Number Between 10-5 is : "+GenRandonNum(5, 10));

	}
	public static  char GenRandonNum(char a,char b) {
		return (char)(a+Math.random()*(b-a));
	}
	public static  int GenRandonNum(int a,int b) {
		return (int)(a+Math.random()*(b-a));
	}

}
