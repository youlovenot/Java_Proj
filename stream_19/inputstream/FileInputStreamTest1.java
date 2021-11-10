package stream_19.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		//FileInputStream fis = new FileInputStream("input.txt");
									//이클립스의 프로젝트 아래
		//FileInputStream fis = new FileInputStream("C:\\Temp\\input.txt");
		
		FileInputStream fis = null;
		try {
			//fis = new FileInputStream("input.txt");		//반드시 예외 처리 (FileNotFoundException)
			fis = new FileInputStream("C:\\Temp\\input.txt");
			
			System.out.println((char)fis.read());		//1바이트를 읽어와서 출력
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {	//IOException은 FileNotFoundException의 상위 Exception
			System.out.println(e);
			//e.printStackTrace();
		} finally {
			fis.close();			//반드시 예외처리
			
		}
		System.out.println("end (프로그램 종료)");
	}

}
