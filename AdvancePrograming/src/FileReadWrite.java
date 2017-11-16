import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) {
		
		File outFile = new File("output.txt");
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		
		try {
			fileReader = new FileReader("input.txt");
			fileWriter = new FileWriter(outFile);
			
			int ch;
			while((ch = fileReader.read()) != -1){
				System.out.println(ch);
				ch += 5;
				fileWriter.write((char)ch);
			}
			
		} catch (IOException e) {
			// TODO: handle exception
		}finally {
			try {
				fileReader.close();
				fileWriter.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}

	}

}
