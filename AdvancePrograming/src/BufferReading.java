import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BufferReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		String line;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
