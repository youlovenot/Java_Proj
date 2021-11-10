package stream_19.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) throws IOException {

		//FileInputStream: 기반 스트림. 바이트 스트림. (한글이 모두 깨져서 출력됨.)
		//InputStreamReader: 보조 스트림. 바이트 스트림을 문자스트림으로 변환
		
		System.out.println("====한글이 모두 깨짐(FileInputStream)=====");
		FileInputStream fis = new FileInputStream("reader.txt");
		int i;
		while ((i=fis.read()) != -1) {
			System.out.print((char)i);
		}
		
		System.out.println("\n\n보조 스트림을 사용해서 한글을 출력시킴");
		
		InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"));
			//보조스트림 사용법 : 생성자 내부에 (기반 스트림), (다른 보조스트림)을 포함.
		int j;
		while ( (j=isr.read())!=-1) {
			System.out.print((char)j);
		}
	}

}
