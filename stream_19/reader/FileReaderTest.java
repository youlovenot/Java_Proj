package stream_19.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("reader.txt");
		int i;
		while ((i=fr.read()) != -1) {
			System.out.print((char)i);
		}
		fr.close();
		System.out.println("\n프로그램 종료");
		
	}
	
}
