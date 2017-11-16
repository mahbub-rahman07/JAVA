import java.util.Scanner;

public class DesimalPlace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextDouble();
		System.out.printf("%4f %.3f",num,num*num);

	}

}
