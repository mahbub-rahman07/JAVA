import java.util.Scanner;

public class StringProblem {

	public static void main(String[] args) {
		String[] st = {"Apple","Banan","Mango"};
		for(String s : st){
			prln(s);
			s = sc.nextLine();
		}
		prln(st[0]);
	}
	static void pf(Object ob){
		System.out.println(ob);
	}
	static void prln(Object ob){
		System.out.println(ob);
	}
	static Scanner sc = new Scanner(System.in);

}
