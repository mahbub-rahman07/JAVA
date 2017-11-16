import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferWriterFilewriter {

	public static void main(String[] args) {
		BufferedWriter bw = null;
		String line;
		Scanner sc = new Scanner(System.in);
		
		try {
			bw = new BufferedWriter(new FileWriter("output.txt"));
			//bw.write("There is the way to write file");
			while(sc.hasNext()){
				line = sc.nextLine();
				if(line == null)
					break;
				bw.write(line);
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
