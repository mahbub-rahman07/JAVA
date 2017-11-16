
public class StringVsStringBuffer {

	public static void main(String[] args) {
		String s = "1";
		String s2 = "2";
		StringBuffer s3 = new StringBuffer("1");
		for(int i= 0;i<100000;i++){
			s3.append(s2);
		}
		System.out.println(s3); // it takes less then 0.5 sec;
		for(int i= 0;i<100000;i++){
			s = s+s2;
		}
		System.out.println(s); // it takes more then 20 sec


	}

}
